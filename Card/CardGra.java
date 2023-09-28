package Card;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.DefaultXYDataset;

import javax.swing.*;
import java.awt.*;

public class CardGra {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Gráficos em Abas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JTabbedPane tabbedPane = new JTabbedPane();

        // Aba de Gráfico de Barras
        JFreeChart barChart = createBarChart();
        ChartPanel barChartPanel = new ChartPanel(barChart);
        tabbedPane.addTab("Gráfico de Barras", barChartPanel);

        // Aba de Gráfico de Pizza
        JFreeChart pieChart = createPieChart();
        ChartPanel pieChartPanel = new ChartPanel(pieChart);
        tabbedPane.addTab("Gráfico de Pizza", pieChartPanel);

        // Aba de Gráfico de Linhas
        JFreeChart lineChart = createLineChart();
        ChartPanel lineChartPanel = new ChartPanel(lineChart);
        tabbedPane.addTab("Gráfico de Linhas", lineChartPanel);

        frame.getContentPane().add(tabbedPane);
        frame.setVisible(true);
    }

    private static JFreeChart createBarChart() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Série 1", "Categoria 1");
        dataset.addValue(4.0, "Série 1", "Categoria 2");
        dataset.addValue(3.0, "Série 1", "Categoria 3");

        return ChartFactory.createBarChart(
                "Gráfico de Barras",
                "Categorias",
                "Valores",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );
    }

    private static JFreeChart createPieChart() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Item 1", 30);
        dataset.setValue("Item 2", 45);
        dataset.setValue("Item 3", 25);

        JFreeChart chart = ChartFactory.createPieChart3D(
                "Gráfico de Pizza",
                dataset,
                true,
                true,
                false
        );

        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        return chart;
    }

    private static JFreeChart createLineChart() {
        DefaultXYDataset dataset = new DefaultXYDataset();
        double[][] data = new double[2][5];
        data[0] = new double[]{1, 2, 3, 4, 5};
        data[1] = new double[]{10, 15, 7, 12, 8};
        dataset.addSeries("Série 1", data);

        return ChartFactory.createXYLineChart(
                "Gráfico de Linhas",
                "X",
                "Y",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );
    }
}
