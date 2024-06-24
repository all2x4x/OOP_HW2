public enum EProduct {
    
    APPLE ("Яблоко"),
    POTATO ("Картошка"),
    JUICE ("Сок"),
    SUGAR ("Сахар"),
    FILE ("Филе"),
    MEAT ("Мясо"),
    VODKA("Водка");

    private String title;

    EProduct(String string) {
        this.title = string;
    }

    public String getTitle() {
       return title;
   }
}
