import {useEffect, useRef, useState} from "react";

import style from './LineChart.module.css'
import { Chart } from "react-google-charts";

function LineChart() {
      console.log("Render LineChart");

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
                  'Ниже нормы',
                  'Норма',
                  'Выше нормы',
                  'Уровень глюкозы (ММОЛЬ/Л)',
                  'Custom'
            ],
            [1, 4, 4, 4, 6, {v: 6, f: '11.00\n01.12.2022'}],
            [2, 4, 4, 4, 1, 6],
            [3, 4, 4, 4, 7, 6],
            [4, 4, 4, 4, 10, 6],
            [5, 4, 4, 4, 6, 6],
            [6, 4, 4, 4, 6, 6],
            [7, 4, 4, 4, 6, 6],
            [8, 4, 4, 4, 6, 6],
            [9, 4, 4, 4, 6, 6],
            [10, 4, 4, 4, 6, 6],
            [11, 4, 4, 4, 6, 6],
            [12, 4, 4, 4, 6, 6],
            [13, 4, 4, 4, 6, 6],
            [14, 4, 4, 4, 6, 6],
            [15, 4, 4, 4, 6, 6],
      ];

      const options = {

/*            theme: 'material',*/
            smoothLine: true,
            chartArea: {
                  // leave room for y-axis labels
/*                  width: '92%',
                  height: '65%',
                  top:25*/
                  width: '92%',
                  height: '75%'
            },
            legend: {
                  textStyle:{
                        fontSize: 16
                  },
                  position: 'top',
                  enableInteractivity: false
            },
            width: size.width - 240,
            height: size.height - 475,
            tooltip: {
                  isHtml: true,
            },
            theme: 'material',
            hAxis: {
                  textStyle:{
/*                        color: 'black'*/
                  },
                  baselineColor: 'white',
                  ticks: [
                        {v: 'dsd', f: '07.00\n01.12.2022'},
                        {v: 2, f: '07.28\n01.12.2022'},
                        {v: 3, f: '07.35\n01.12.2022'},
                        {v: 4, f: '07.00\n02.12.2022'},
                        {v: 5, f: '07.28\n02.12.2022'},
                        {v: 6, f: '07.35\n02.12.2022'},
                        {v: 7, f: '07.00\n03.12.2022'},
                        {v: 8, f: '07.28\n03.12.2022'},
                        {v: 9, f: '07.35\n03.12.2022'},
                        {v: 10, f: '07.00\n04.12.2022'},
                        {v: 11, f: '07.28\n04.12.2022'},
                        {v: 12, f: '07.35\n04.12.2022'},
                        {v: 13, f: '07.00\n05.12.2022'},
                        {v: 14, f: '07.28\n05.12.2022'},
                        {v: 15, f: '07.35\n05.12.2022'}
                  ],
                  title: 'ВРЕМЯ/ДАТА',
/*                  slantedText: true,*/
            },
            isStacked: true,
            series: {
                  0: {
                        areaOpacity: 0.7,
                        color: '#E6F1FD',
                        visibleInLegend: true,
                        tooltip: false,
/*                        pointSize: 0,
                        dataOpacity: 0,
                        visible: false,*/
                        enableInteractivity: false
                  },
                  1: {
                        areaOpacity: 0.7,
                        color: '#D5FCE5',
                        visibleInLegend: true,
                        tooltip: false,
                        enableInteractivity: false
                  },
                  2: {
                        areaOpacity: 0.7,
                        color: '#FAD8C7',
                        visibleInLegend: true,
                        tooltip: false,
                        enableInteractivity: false
                  },
                  3: {
                        color: 'black',
                        type: 'line',
                        visibleInLegend: false,
                  },
/*                  4: {
                        color: 'red',
                        type: 'line',
                        visibleInLegend: false,
                        labelInLegend: 'max.temp.'
                  }*/
            },
            seriesType: 'area',
/*            title: 'Example',*/
            vAxis: {
                  textStyle:{
/*                        color: 'rgba(0, 0, 0, 0.38)'*/
                  },
                  ticks: [4, 8, 12],
                  title: 'ММОЛЬ/Л',
                  titleTextStyle: {
/*                        color: 'gray'*/
                  },
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