
package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;

@ManagedBean(name = "pbiBean") 
@RequestScoped 
public class PBIBean {

    private CartesianChartModel pbis;

    public PBIBean() {
        pbis = new CartesianChartModel();

        ChartSeries anual = new ChartSeries();
        anual.setLabel("Anual");

        anual.set(2000, 3.0);
        anual.set(2001, 0.2);
        anual.set(2002, 5.0);
        anual.set(2003, 4.0);
        anual.set(2004, 5.1);
        anual.set(2005, 6.7);
        anual.set(2006, 7.6);
        anual.set(2007, 8.9);
        anual.set(2008, 9.7);
        anual.set(2009, 0.9);
        anual.set(2010, 8.78);

        pbis.addSeries(anual);
    }

    public CartesianChartModel getPbis() {
        return pbis;
    }
}
