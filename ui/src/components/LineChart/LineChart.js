import style from './LineChart.module.css'
import { Chart } from "react-google-charts";

function LineChart() {
      const data = [
            ["Year", "Sales", "Expenses", "Profit"],
            ["2014", 1000, 1000, 1000],
            ["2015", 1000, 1000, 1000],
            ["2016", 1000, 1000, 1000],
            ["2017", 1000, 1000, 1000],
      ];

      const options = {
            chart: {
                  title: "Company Performance",
                  subtitle: "Sales, Expenses, and Profit: 2014-2017",
            },
      };
      const options2 = {
            chartArea: {
                  width: '60%'
            },
            hAxis: {
                  ticks: [0, 15, 30, 45, 60],
                  title: 'Time'
            },
            isStacked: true,
            series: {
                  // low
                  0: {
                        areaOpacity: 0.6,
                        color: '#FFF59D',
                        visibleInLegend: false
                  },

                  // avg
                  1: {
                        areaOpacity: 0.6,
                        color: '#A5D6A7',
                        visibleInLegend: false
                  },

                  // high
                  2: {
                        areaOpacity: 0.6,
                        color: '#EF9A9A',
                        visibleInLegend: false
                  },

                  // dogs
                  3: {
                        color: '#01579B',
                        type: 'line'
                  }
            },
            seriesType: 'area',
            title: 'Example',
            vAxis: {
                  ticks: [0, 25, 50, 75, 100],
                  title: 'Popularity'
            }
      };

      return (
            <div className={style.lineChart}>
                  New Line Chart
                  <Chart
                        chartType="ComboChart"
                        width="100%"
                        height="400px"
                        data={data}
                        options={options2}
                  />
            </div>
      );
}

export default LineChart;