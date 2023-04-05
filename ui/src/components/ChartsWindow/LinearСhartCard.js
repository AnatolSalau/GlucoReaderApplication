import style from './LinearСhartCard.module.css'
import LineChart from "../LineChart/LineChart";

function LinearChartCard() {
      return (
            <div
                  className={style.linearChart}
            >
                  <div className={style.legendWrapper}>
                        <div
                              className={style.legend}
                        >
                              <div
                                    className={style.legendTitle}
                              >
                                    ГРАФИК ИЗМЕРЕНИЙ
                              </div>
                              <div
                                    className={style.legendBody}
                              >
                                    <div className={style.legendBodyColumn}>
                                          <div className={style.legendBodyRow}>
                                                За период:
                                                <div className={style.legendBodyRowValue}>
                                                      c 01.12.2022 по 28.02.2023
                                                </div>
                                          </div>
                                          <div className={style.legendBodyRow}>
                                                Метки еды:
                                                <div className={style.legendBodyRowValue}>
                                                      натощак
                                                </div>
                                          </div>
                                          <div className={style.legendBodyRow}>
                                                Пользовательская метка:
                                                <div className={style.legendBodyRowValue}>
                                                      без метки
                                                </div>
                                          </div>
                                          <div
                                                className={style.legendBodyRow}
                                                style={{minHeight:18}}
                                          >

                                          </div>
                                    </div>
                                    <div className={style.legendBodyColumn}>
                                          <div className={style.legendBodyRow}>
                                                Всего результатов:
                                                <div className={style.legendBodyRowValue}>
                                                      8
                                                </div>
                                          </div>
                                          <div className={style.legendBodyRow}>
                                                Выше нормы:
                                                <div className={style.legendBodyRowValue}>
                                                      1
                                                </div>
                                          </div>
                                          <div className={style.legendBodyRow}>
                                                В пределах нормы:
                                                <div className={style.legendBodyRowValue}>
                                                      4
                                                </div>
                                          </div>
                                          <div className={style.legendBodyRow}>
                                                Ниже нормы:
                                                <div className={style.legendBodyRowValue}>
                                                      2
                                                </div>
                                          </div>
                                    </div>
                              </div>
                        </div>
                  </div>
                  <div
                        className={style.chartWrapper}
                  >
                        <LineChart />
                  </div>
            </div>
      )
}

export default LinearChartCard;