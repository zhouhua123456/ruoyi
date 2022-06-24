package com.ruoyi.demoTest.play.doudizhu;

import java.util.*;

/**
 * 扑克牌
 */
public class Card {

    /**
     * 默认卡牌
     */
    public static final String numb[] ={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};

    /**
     * 一副牌
     */
    public static List<Card> ADeckOfCards  = new ArrayList<>();

    /**
     * 底牌
     */
    public static List<Card> belowCards  = new ArrayList<>();


    /**
     * 扑克牌的数字
     */
    private String cardNumb;

    private String colour;


    public Card(String cardNumb,String colour){
        this.cardNumb = cardNumb;
        this.colour = colour;
    }

    /**
     * 扑克牌的组装方式
     * 单，对，三代二，顺子等
     */
    public String assembleSingle(String cardNumb){
        return cardNumb;
    }

    public static void main(String[] args) {
        List<Card> cards = initAll();
        List<Card> belowCards = getBelowCards(cards);
        List<Card> zhouhua = distribute(ADeckOfCards);
        List<Card> zhangsan = distribute(ADeckOfCards);
        List<Card> lisi = distribute(ADeckOfCards);
        System.out.println(ADeckOfCards.size());
    }


    /**
     * 扑克牌的大小比较策略
     */

    /**
     * 单张
     * @return
     */
    public boolean compareSingle(String ownCard,String othersCard){
        return false;
    }

    /**
     * 初始化一副牌
     */
    public static List<Card> initAll(){

        for (String s : numb) {
           if(s.equals("14")){
               Card x = new Card(s, Colours.X.toString());
               ADeckOfCards.add(x);
           }else if(s.equals("15")){
               Card x = new Card(s, Colours.D.toString());
               ADeckOfCards.add(x);
           }else{
               Card hong = new Card(s, Colours.Hong.toString());
               Card fang = new Card(s, Colours.Fang.toString());
               Card hei = new Card(s, Colours.Hei.toString());
               Card mei = new Card(s, Colours.Mei.toString());
               ADeckOfCards.add(hong);
               ADeckOfCards.add(fang);
               ADeckOfCards.add(hei);
               ADeckOfCards.add(mei);
           }
        }
        return ADeckOfCards;
    }

    /**
     * 发牌之前取底牌三张随机牌
     */
    public static List<Card> getBelowCards(List<Card> ADeckOfCards){
        for (int i = 0 ;i< 3;i++){
            int index = new Random().nextInt(ADeckOfCards.size());
            belowCards.add(ADeckOfCards.get(index));
            ADeckOfCards.remove(index);
        }

         Collections.sort(belowCards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return Integer.parseInt(o1.cardNumb) == Integer.parseInt(o2.cardNumb) ? 0 :
                        (Integer.parseInt(o1.cardNumb) < Integer.parseInt(o2.cardNumb) ? -1:1);
            }
        });

        return belowCards;
    }

    /**
     * 分发三套手牌给三个人
     * @return
     */
    public static List<Card> distribute(List<Card> ADeckOfCards){
        List<Card> handCards = new ArrayList<>();
        for(int i=1;i<18;i++){
            int index = new Random().nextInt(ADeckOfCards.size());
            handCards.add(ADeckOfCards.get(index));
            ADeckOfCards.remove(index);
        }
        Collections.sort(handCards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return Integer.parseInt(o1.cardNumb) == Integer.parseInt(o2.cardNumb) ? 0 :
                        (Integer.parseInt(o1.cardNumb) < Integer.parseInt(o2.cardNumb) ? -1:1);
            }
        });
        return handCards;
    }

    /**
     * 随机从数组中拿一张牌，
     * 1-13最多不超过4，大小王不超2；而却数量也会随着拿牌变少
     */
    @Override
    public String toString() {
        return "Card{" +
                "cardNumb='" + cardNumb + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
