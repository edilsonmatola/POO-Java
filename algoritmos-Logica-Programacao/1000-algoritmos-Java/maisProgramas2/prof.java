class prof{

    String nome;
    String nomedep;
    int dataamdin;
    int nregisto;

    prof(String nome){
        this.nome = nome;
    }
    prof(String nomedep,int dataamdin,int nregisto){

        this.nomedep = nomedep;
        this.dataamdin = dataamdin;
        this.nregisto = nregisto;
    }

    String getnome(){
        return this.nome;
    }
    
    String getnomedep(){
        return this.nomedep;
    }

    int dataamdin(){
        return this.dataamdin;
    }
    int nregisto(){
        return this.nregisto;
    }
    void setnome(String nome){
        this.nome = nome;
    }
    /**
     * @param nomedep the nomedep to set
     */
    public void setnomedep(String nomedep) {
        this.nomedep = nomedep;
    }
    void setdataadmin(int dataamdin){
        this.dataamdin = dataamdin;
    }
    void setnregisto(int nregisto){
        this.nregisto = nregisto;
    }

}