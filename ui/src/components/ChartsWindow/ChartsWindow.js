import style from './ChartsWindow.module.css'
import Input from "../Input";
import {VscTriangleDown} from "react-icons/vsc";
import {MdOutlineCalendarToday} from "react-icons/md";

import {FiCheck} from "react-icons/fi";
import Button from "../Button";

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
                                    <div style={{
                                          display: "flex",
                                          gap: 35
                                    }}>
                                          <Input
                                                textInFront={'Ф.И.О. пациента:'}
                                                placeholderText={'Фамилия Имя Отчество'}
                                                inputWidth={426}
                                          />
                                          <Input
                                                textInFront={'Возраст:'}
                                                placeholderText={'49'}
                                                inputWidth={145}
                                          />
                                    </div>
                                    <div style={{
                                          display: "flex",
                                          gap: 6
                                    }}>
                                          <Input
                                                textInFront="Период с:"
                                                placeholderText="100"
                                                inputWidth={165}
                                          >
                                                <MdOutlineCalendarToday />
                                          </Input>
                                          <Input
                                                textInFront="по:"
                                                placeholderText="100"
                                                inputWidth={165}
                                          >
                                                <MdOutlineCalendarToday />
                                          </Input>
                                    </div>
                              </div>
                              <div
                                    className={style.navBarRow}
                              >
                                    <Input
                                          textInFront="Вид:"
                                          placeholderText="Круговая диаграмма"
                                          inputWidth={251}
                                    >
                                          <VscTriangleDown />
                                    </Input>
                                    <Input
                                          textInFront="Единица измерения:"
                                          placeholderText="ммоль/л"
                                          inputWidth={270}
                                    >
                                          <VscTriangleDown />
                                    </Input>
                                    <Input
                                          textInFront="Метка еды:"
                                          placeholderText="после еды"
                                          inputWidth={228}
                                    >
                                          <VscTriangleDown />
                                    </Input>
                                    <Input
                                          textInFront="Наличие метки:"
                                          placeholderText="без метки"
                                          inputWidth={253}
                                    >
                                          <VscTriangleDown />
                                    </Input>
                              </div>
                              <div
                                    className={style.navBarButtonRow}
                              >
                                    <Button
                                          text="Применить"
                                    >
                                          <FiCheck />
                                    </Button>
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