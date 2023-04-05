import style from './LineChart.module.css'
import { Chart } from "react-google-charts";

function LineChart() {
      const data = [
            [
                  'Month',
                  'Bolivia',
                  'Ecuador',
                  'Madagascar',
                  'Papua New Guinea',
                  'Rwanda',
                  'Average',
            ],
            ['2004/05', 4, 4, 4, 4, 4, 4],
            ['2005/06', 4, 4, 4, 1, 4, 4],
            ['2006/07', 4, 4, 4, 7, 4, 4],
            ['2007/08', 4, 4, 4, 10, 4, 4],
            ['2008/09', 4, 4, 4, 6, 4, 4],
            ['2008/09', 4, 4, 4, 6, 4, 4],
            ['2008/09', 4, 4, 4, 6, 4, 4],
            ['2008/09', 4, 4, 4, 6, 4, 4],
            ['2008/09', 4, 4, 4, 6, 4, 4],
            ['2008/09', 4, 4, 4, 6, 4, 4],
            ['2008/09', 4, 4, 4, 6, 4, 4],
            ['2008/09', 4, 4, 4, 6, 4, 4],
            ['2008/09', 4, 4, 4, 6, 4, 4],
            ['2008/09', 4, 4, 4, 6, 4, 4],
            ['2008/09', 4, 4, 4, 6, 4, 4],
      ];

      const options2 = {
/*            theme: 'material',*/
            smoothLine: true,
            chartArea: {
/*                  width: '60%'*/
            },
            tooltip: {isHtml: true},
            theme: 'material',
            hAxis: {
                  ticks: [0, 15, 30, 45, 60],
                  title: 'Time',
                  slantedText: true,
            },
            isStacked: true,
            series: {
                  0: {
                        areaOpacity: 0.6,
                        color: '#FFF59D',
                        visibleInLegend: false,
                  },
                  1: {
                        areaOpacity: 0.6,
                        color: '#A5D6A7',
                        visibleInLegend: false
                  },
                  2: {
                        areaOpacity: 0.6,
                        color: '#EF9A9A',
                        visibleInLegend: false
                  },
                  3: {
                        color: 'red',
                        type: 'line',
                  }
            },
            seriesType: 'area',
            title: 'Example',
            vAxis: {
                  ticks: [0, 4, 8, 12, 16],
                  title: 'Popularity'
            }
      };
      return (
            <div className={style.lineChart}>
                  <Chart
                        chartType="ComboChart"
                        width={'100%'}
                        height={'100%'}
                        data={data}
                        options={options2}
                  />
            </div>
      );
}

export default LineChart;