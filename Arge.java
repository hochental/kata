class Arge {
    
    public static int nbYear(int p0, double percent, int aug, int p) {
       Double population= Double.valueOf(p0);
        int years=0;
        percent=percent/100;
        do{
            years++;
            population=population+(population*percent)+aug;
        }while(p>population);
        return years;
    }
}
