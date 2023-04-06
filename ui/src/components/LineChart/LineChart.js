import {useEffect, useState} from "react";

import style from './LineChart.module.css'
import { Chart } from "react-google-charts";


function LineChart() {
      console.log("Render LineChart")
      const [size, setSize] = useState({
            width: window.innerWidth,
            height: window.innerHeight
      });

      const resizeHandler = () => {
            setSize({
                  width: window.innerWidth,
                  height: window.innerHeight
            });
            console.log("Resize handler");
            console.log(size);
      };

      useEffect(() => {
            window.addEventListener("resize", resizeHandler);
            resizeHandler();
      }, []);

      const data = [
            [
                  'Month',
                  'Bolivia',
                  'Ecuador',
                  'Madagascar',
                  'Papua New Guinea'
            ],
            [1, 4, 4, 4, 4],
            [2, 4, 4, 4, 1],
            [3, 4, 4, 4, 7],
            [4, 4, 4, 4, 10],
            [5, 4, 4, 4, 6],
            [6, 4, 4, 4, 6],
            [7, 4, 4, 4, 6],
            [8, 4, 4, 4, 6],
            [9, 4, 4, 4, 6],
            [10, 4, 4, 4, 6],
            [11, 4, 4, 4, 6],
            [12, 4, 4, 4, 6],
            [13, 4, 4, 4, 6],
            [14, 4, 4, 4, 6],
            [15, 4, 4, 4, 6],
      ];

      const options = {
/*            theme: 'material',*/
            smoothLine: true,
            chartArea: {
                  // leave room for y-axis labels
                  width: '92%',
                  height: '75%'

            },
            legend: {
                  position: 'top',
                  enableInteractivity: false
            },
            width: size.width - 225,
            height: '100%',
            tooltip: {isHtml: true},
            theme: 'material',
            hAxis: {
                  textStyle:{color: 'black'},
                  baselineColor: 'white',
                  ticks: [
                        {v: 1, f: 'Zero'},
                        {v: 2, f: 'One'},
                        {v: 3, f: 'Two'},
                        {v: 4, f: 'Zero'},
                        {v: 5, f: 'One'},
                        {v: 6, f: 'Two'},
                        {v: 7, f: 'Zero'},
                        {v: 8, f: 'One'},
                        {v: 9, f: 'Two'},
                        {v: 10, f: 'Zero'},
                        {v: 11, f: 'One'},
                        {v: 12, f: 'Two'},
                        {v: 13, f: 'Zero'},
                        {v: 14, f: 'One'},
                        {v: 15, f: 'Two'}
                  ],
                  title: 'Time',
                  slantedText: true,
            },
            isStacked: true,
            series: {
                  0: {
                        areaOpacity: 0.7,
                        color: '#FFF59D',
                        visibleInLegend: true,
                        tooltip: false,
/*                        pointSize: 0,
                        dataOpacity: 0,
                        visible: false,*/
                        enableInteractivity: false
                  },
                  1: {
                        areaOpacity: 0.7,
                        color: '#A5D6A7',
                        visibleInLegend: true,
                        tooltip: false,
                        enableInteractivity: false
                  },
                  2: {
                        areaOpacity: 0.7,
                        color: '#EF9A9A',
                        visibleInLegend: true,
                        tooltip: false,
                        enableInteractivity: false
                  },
                  3: {
                        color: 'red',
                        type: 'line',
                        visibleInLegend: false,
                  }
            },
            seriesType: 'area',
/*            title: 'Example',*/
            vAxis: {
                  textStyle:{color: 'black'},
                  ticks: [0, 4, 8, 12],
                  title: 'Popularity',
                  baselineColor: 'white',
            }
      };
      return (
            <div className={style.lineChart}>
                  <Chart
                        chartType="ComboChart"
                        data={data}
                        options={options}
                  />
            </div>
      );
}

export default LineChart;