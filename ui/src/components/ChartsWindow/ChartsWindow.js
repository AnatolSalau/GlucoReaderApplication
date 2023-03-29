import style from './ChartsWindow.module.css'
import Input from "../Input";

function ChartsWindow() {
      return(
            <div
                  className={style.chartsWindow}
            >
                  <div
                        className={style.wrapper}
                  >
                        <div
                              className={style.navBar}
                        >
                              <div
                                    className={style.navBarRow}
                              >
                                    <Input
                                          textInFront={'Ф.И.О. пациента:'}
                                          placeholderText={'Фамилия Имя Отчество'}
                                          inputWidth={426}
                                    />
                                    <Input
                                          textInFront={'Возраст:'}
                                          placeholderText={'49'}
                                          inputWidth={165}
                                    />
                              </div>
                              <div
                                    className={style.navBarRow}
                              >
                                    Row2
                              </div>
                              <div
                                    className={style.navBarRow}
                              >
                                    Row3
                              </div>
                        </div>
                        <div
                              className={style.chartCard}
                        >

                              chartCard
                        </div>
                  </div>
            </div>
      )
}

export default ChartsWindow;