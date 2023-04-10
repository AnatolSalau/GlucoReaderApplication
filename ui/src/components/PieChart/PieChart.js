import style from './PieChart.module.css'
import {useEffect, useState} from "react";
import {Chart} from "react-google-charts";

function PieChart() {
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
            ["Task", "Hours per Day"],
            ["ниже нормы", 1],
            ["норма", 6],
            ["выше нормы", 3]
      ];

      const options = {
            colors: [
                  '#69B2FC',
                  '#69FCB2',
                  '#FC9969'
            ],
            width: 500,
            height: 350,
            chartArea: {
                  // leave room for y-axis labels
                  /*                  width: '92%',
                                    height: '65%',
                                    top:25*/
/*                  top:25,
                  left: 35,
                  right: 35,
                  bottom:50,*/
                  top: 10,
                  bottom: 30,
                  left:50,
                  right:50,
                  width: '95%',
                  height: '80%'
            },
            legend: {
                  textStyle:{
                        fontSize: 16
                  },
                  position: 'bottom',
                  enableInteractivity: false
            },
            theme: 'material',
/*            title: "My Daily Activities",*/
            pieHole: 0.6,
            is3D: false,
            tooltip: {
                  trigger: 'none',
                  isHtml: true,
            },
            enableInteractivity: false,

      };
      return (
            <div className={style.pieChart}>
                  <div className={style.legendTop}>
                        <div className={style.legendLabel}>
                              ГРАФИК ИЗМЕРЕНИЙ
                        </div >
                        <div className={style.legendTopBody}>
                              <div className={style.row}>
                                  За период:
                                    <div className={style.bold}>
                                          c 01.12.2022 по 28.02.2023
                                    </div>
                              </div>
                              <div className={style.row}>
                                    Метки еды:
                                    <div className={style.bold}>
                                          натощак
                                    </div>
                              </div>
                              <div className={style.row}>
                                    Пользовательская метка:
                                    <div className={style.bold}>
                                          без метки
                                    </div>
                              </div>
                        </div>
                  </div>
                  <Chart
                        chartType="PieChart"
                        data={data}
                        options={options}
                  />
                  <div className={style.row}>
                        Всего результатов:
                        <div className={style.bold}>
                              90
                        </div>
                  </div>
                  <div className={style.bottomBody}>
                        <div className={style.bottomCol}>
                              <div className={style.row}>
                                    <div className={style.lessMark}/>
                              </div>
                              <div className={style.row}>
                                    ниже нормы
                              </div>
                              <div className={style.row}>
                                    <div className={style.bold}>
                                          10 %
                                    </div>
                              </div>
                              <div className={style.row}>
                                    средний
                              </div>
                              <div className={style.row}>
                                    показатель
                              </div>
                              <div className={style.row}>
                                    <div className={style.bold}>
                                          3,7
                                    </div>
                              </div>
                              <div className={style.row}>
                                    <div className={style.bold}>
                                          ммоль/л
                                    </div>
                              </div>
                        </div>
                        <div className={style.bottomCol}>
                              <div className={style.row}>
                                    <div className={style.normMark}/>
                              </div>
                              <div className={style.row}>
                                    норма
                              </div>
                              <div className={style.row}>
                                    <div className={style.bold}>
                                          60 %
                                    </div>
                              </div>
                              <div className={style.row}>
                                    средний
                              </div>
                              <div className={style.row}>
                                    показатель
                              </div>
                              <div className={style.row}>
                                    <div className={style.bold}>
                                          5,7
                                    </div>
                              </div>
                              <div className={style.row}>
                                    <div className={style.bold}>
                                          ммоль/л
                                    </div>
                              </div>
                        </div>
                        <div className={style.bottomCol}>
                              <div className={style.row}>
                                    <div className={style.moreMark}/>
                              </div>
                              <div className={style.row}>
                                    выше нормы
                              </div>
                              <div className={style.row}>
                                    <div className={style.bold}>
                                          30 %
                                    </div>
                              </div>
                              <div className={style.row}>
                                    средний
                              </div>
                              <div className={style.row}>
                                    показатель
                              </div>
                              <div className={style.row}>
                                    <div className={style.bold}>
                                          9,5
                                    </div>
                              </div>
                              <div className={style.row}>
                                    <div className={style.bold}>
                                          ммоль/л
                                    </div>
                              </div>
                        </div>
                  </div>
            </div>
      );
}

export default PieChart;