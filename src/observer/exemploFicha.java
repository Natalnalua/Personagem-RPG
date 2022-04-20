package observer;

import java.util.List;
import java.util.ArrayList;

public class exemploFicha implements IFichas{
    private List<IMestre> mestres = new ArrayList();
    private Ficha e;

    @Override
    public void registrarMestre(IMestre a) {
	mestres.add(a);
    }

    @Override
    public void removerMestre(IMestre a) {
	mestres.remove(a);
    }

    @Override
    public void notificarMestre() {
	for (IMestre a : mestres)
            a.update(e);
    }

    public void setFicha(Ficha e) {
	this.e = e;
    }

}
