import android.util.Log;

public class Personel {
    private int yas;
    private int maas;

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas<18||yas>55){
            Log.e("kapsülleme","Hatalı yaş");
            yas=18;
        }
        this.yas = yas;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        if (maas<4253){
            Log.e("kapsülleme","hatalı maaş");
            maas=4253;
        }
        this.maas = maas;
    }
}


