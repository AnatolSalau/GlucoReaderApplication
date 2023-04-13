import {useEffect, useRef, useState} from "react";

import style from './PrintLineChart.module.css'
import { Chart } from "react-google-charts";

function PrintLineChart() {
      console.log("Render PrintLineChart");

      const data = [
            [
                  'Month',
                  'Ниже нормы',
                  'Норма',
                  'Выше нормы',
                  'Уровень глюкозы',
                  'Уровень глюкозы'
            ],
            [1, 4, 4, 4, 6, {v: 6, f: '6 \n01.12.2022'}],
            [2, 4, 4, 4, 1, {v: 1, f: '1\n01.12.2022'}],
            [3, 4, 4, 4, 7, {v: 7, f: '7\n01.12.2022'}],
            [4, 4, 4, 4, 10, {v: 10, f: '10\n02.12.2022'}],
            [5, 4, 4, 4, 6, {v: 6, f: '6\n02.12.2022'}],
            [6, 4, 4, 4, 6, {v: 6, f: '6\n02.12.2022'}],
            [7, 4, 4, 4, 6, {v: 6, f: '6\n03.12.2022'}],
            [8, 4, 4, 4, 6, {v: 6, f: '6\n03.12.2022'}],
            [9, 4, 4, 4, 6, {v: 6, f: '6\n03.12.2022'}],
            [10, 4, 4, 4, 6, {v: 6, f: '6\n04.12.2022'}],
            [11, 4, 4, 4, 6, {v: 6, f: '6\n04.12.2022'}],
            [12, 4, 4, 4, 6, {v: 6, f: '6\n04.12.2022'}],
            [13, 4, 4, 4, 6, {v: 6, f: '6\n05.12.2022'}],
            [14, 4, 4, 4, 6, {v: 6, f: '6\n05.12.2022'}],
            [15, 4, 4, 4, 6, {v: 6, f: '6\n05.12.2022'}],
      ];

      const options = {
            smoothLine: true,
            chartArea: {
                  top:25,
                  left: 50,
                  right: 55,
                  bottom:125,
                  width: '70%',
                  height: '70%'
            },
            legend: {
                  textStyle:{
                        fontSize: 16
                  },
                  position: 'top',
                  maxLines: 5,
                  enableInteractivity: false
            },
            width: 750,
            height: 500,
            tooltip: {
                  isHtml: true,
            },
            theme: 'material',
            hAxis: {
/*                  format:'MMM dd, yyy \nHH:mm',*/
                  textStyle:{
/*                        color: 'black'*/
                  },
                  baselineColor: 'white',
                  ticks: [
                        {v: 1, f: '07.00 (01.12.2022)'},
                        {v: 2, f: '07.28 (01.12.2022)'},
                        {v: 3, f: '07.35 (01.12.2022)'},
                        {v: 4, f: '07.00 (02.12.2022)'},
                        {v: 5, f: '07.28 (02.12.2022)'},
                        {v: 6, f: '07.35 (02.12.2022)'},
                        {v: 7, f: '07.00 (03.12.2022)'},
                        {v: 8, f: '07.28 (03.12.2022)'},
                        {v: 9, f: '07.35 (03.12.2022)'},
                        {v: 10, f: '07.00 (04.12.2022)'},
                        {v: 11, f: '07.28 (04.12.2022)'},
                        {v: 12, f: '07.35 (04.12.2022)'},
                        {v: 13, f: '07.00 (05.12.2022)'},
                        {v: 14, f: '07.28 (05.12.2022)'},
                        {v: 15, f: '07.35 (05.12.2022)'}
                  ],
                  title: 'ВРЕМЯ/ДАТА',
                  slantedText: true,
/*                  alwaysOutside: true,*/
                  slantedTextAngle: 60,
                  maxAlternation: 6
            },
            isStacked: true,
/*            alwaysOutside: true,*/
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
                        visibleInLegend: true,
                        tooltip: false,
                        enableInteractivity: false
                  },
                  4: {
                        color: 'black',
                        type: 'line',
                        visibleInLegend: false,
                        enableInteractivity: false
                  }
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
            <div className={style.printLineChart}>
                  <Chart
                        chartType="ComboChart"
                        data={data}
                        options={options}
                  />
            </div>
      );
}

export default PrintLineChart;