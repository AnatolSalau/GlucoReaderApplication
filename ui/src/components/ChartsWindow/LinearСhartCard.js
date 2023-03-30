import style from './LinearСhartCard.module.css'

function LinearChartCard() {
      return (
            <div
                  className={style.linearChart}
            >
                  <div
                        className={style.legend}
                  >
                        <div
                              className={style.legendTitle}
                        >
                              График измерений
                        </div>
                        <div
                              className={style.legendBody}
                        >
                              <div className={style.legendBodyColumn}>
                                   <div className={style.legendBodyRow}>
                                         1-1
                                   </div>
                                    <div className={style.legendBodyRow}>
                                          1-2
                                    </div>
                                    <div className={style.legendBodyRow}>
                                          1-3
                                    </div>
                                    <div className={style.legendBodyRow}>
                                          1-4
                                    </div>
                              </div>
                              <div className={style.legendBodyColumn}>
                                    <div className={style.legendBodyRow}>
                                          2-1
                                    </div>
                                    <div className={style.legendBodyRow}>
                                          2-2
                                    </div>
                                    <div className={style.legendBodyRow}>
                                          2-3
                                    </div>
                                    <div className={style.legendBodyRow}>
                                          2-4
                                    </div>
                              </div>
                        </div>
                  </div>
                  <div
                        className={style.chartWrapper}
                  >
                        График
                  </div>
            </div>
      )
}

export default LinearChartCard;