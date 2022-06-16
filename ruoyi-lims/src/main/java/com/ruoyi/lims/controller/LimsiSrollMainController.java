package com.ruoyi.lims.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.lims.domain.LimsiSrollMain;
import com.ruoyi.lims.service.ILimsiSrollMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * 委托查询Controller
 *
 * @author ruoyi
 * @date 2022-03-25
 */

@RestController
@RequestMapping("/lims/limsiSrollMain")
@EnableAsync
public class LimsiSrollMainController extends BaseController
{
    @Autowired
    private ILimsiSrollMainService limsiSrollMainService;

    @Autowired
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    /**
     * 查询委托查询列表
     */
    @PreAuthorize("@ss.hasPermi('lims:limsiSrollMain:list')")
    @GetMapping("/list")
    public TableDataInfo list(LimsiSrollMain limsiSrollMain)
    {
        /**
         * 测试线程池
         */
        CompletableFuture.runAsync(()->{
            int result= 0;
            for(int i=0;i<100;i++){
                result += i;
                System.out.println(i);
            }

        },threadPoolTaskExecutor);

        startPage();
        List<LimsiSrollMain> list = limsiSrollMainService.selectLimsiSrollMainList(limsiSrollMain);
        for (LimsiSrollMain srollMain : list) {
            System.out.println(srollMain.getSampleTime());
        }
        return getDataTable(list);
    }

    /**
     * 导出委托查询列表
     */
    @PreAuthorize("@ss.hasPermi('lims:limsiSrollMain:export')")
    @Log(title = "委托查询", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, LimsiSrollMain limsiSrollMain)
    {
        List<LimsiSrollMain> list = limsiSrollMainService.selectLimsiSrollMainList(limsiSrollMain);
        ExcelUtil<LimsiSrollMain> util = new ExcelUtil<LimsiSrollMain>(LimsiSrollMain.class);
        util.exportExcel(response, list, "委托查询数据");
    }

    /**
     * 获取委托查询详细信息
     */
    @PreAuthorize("@ss.hasPermi('lims:limsiSrollMain:query')")
    @GetMapping(value = "/{sid}")
    public AjaxResult getInfo(@PathVariable("sid") Long sid)
    {
        return AjaxResult.success(limsiSrollMainService.selectLimsiSrollMainBySid(sid));
    }

    /**
     * 新增委托查询
     */
    @PreAuthorize("@ss.hasPermi('lims:limsiSrollMain:add')")
    @Log(title = "委托查询", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody LimsiSrollMain limsiSrollMain)
    {
        return toAjax(limsiSrollMainService.insertLimsiSrollMain(limsiSrollMain));
    }

    /**
     * 修改委托查询
     */
    @PreAuthorize("@ss.hasPermi('lims:limsiSrollMain:edit')")
    @Log(title = "委托查询", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody LimsiSrollMain limsiSrollMain)
    {
        return toAjax(limsiSrollMainService.updateLimsiSrollMain(limsiSrollMain));
    }

    /**
     * 删除委托查询
     */
    @PreAuthorize("@ss.hasPermi('lims:limsiSrollMain:remove')")
    @Log(title = "委托查询", businessType = BusinessType.DELETE)
	@DeleteMapping("/{sids}")
    public AjaxResult remove(@PathVariable Long[] sids)
    {
        return toAjax(limsiSrollMainService.deleteLimsiSrollMainBySids(sids));
    }
}
