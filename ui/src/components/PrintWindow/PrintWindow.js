import style from "../PrintWindow/PrintWindow.module.css";
import Dropdown from "../Dropdown";
import {useState} from "react";
import Input from "../Input";
import {VscTriangleDown} from "react-icons/vsc";
import Button from "../Button";
import {FiCheck, FiLayout, FiPrinter} from "react-icons/fi";
import PrintWindowTab from "./PrintWindowTab";
import PrintWindowAddTab from "./PrintWindowAddTab";
import PrintDocumentCard from "./PrintDocumentCard";
import PrintLinearChartCard from "../PrintLineChart/PrintLinearСhartCard";
import PrintPieChartCard from "../PrintPieChart/PrintPieChartCard";
import PrintPatientResultTable from "../PrintPatientResultTable/PrintPatientResultTable";


function PrintWindow() {
      const dropDownItems = ['Сохранить документ pdf', 'Принтер 1', 'Принтер 2'];
      const [selectedItem, setSelectedItem] = useState(dropDownItems[0]);
      return(
            <div
                  className={style.printWindow}
            >
                  <div
                        className={style.navBar}
                  >
                        <div
                              className={style.navBarWrapper}
                        >
                              <Input
                                    textInFront="Ф.И.O пациента:"
                                    inputWidth={400}
                                    placeholderText="Фамилия Имя Отчество"
                              >
                                    <VscTriangleDown />
                              </Input>
                              <Input
                                    textInFront="Возраст:"
                                    inputWidth={165}
                                    placeholderText="49"
                              >
                                    <VscTriangleDown />
                              </Input>
                        </div>

                  </div>
                  <div
                        className={style.printBar}
                  >
                        <div
                              className={style.printBarWrapper}
                        >
                              <div className={style.leftCol}>
                                    <div className={style.leftColNavBar}>
                                          Включить в документ:
                                          <PrintWindowTab
                                                text="таблица данных"
                                          >
                                                <FiLayout />
                                          </PrintWindowTab>
                                          <PrintWindowTab
                                                text="круговая диаграмма"
                                          >
                                                <FiLayout />
                                          </PrintWindowTab>
                                          <PrintWindowTab
                                                text="линейный график"
                                          >
                                                <FiLayout />
                                          </PrintWindowTab>
                                          <PrintWindowAddTab />
                                    </div>
                                    <div className={style.leftColBodyWrapper}>
                                          <div className={style.scrollable}>
                                                <div className={style.leftColBody}>
                                                      <PrintDocumentCard>
                                                            <PrintLinearChartCard />
                                                      </PrintDocumentCard>
                                                      <PrintDocumentCard>
                                                            <PrintPieChartCard />
                                                      </PrintDocumentCard>
                                                      <PrintDocumentCard>
                                                            <PrintPatientResultTable />
                                                      </PrintDocumentCard>
                                                </div>
                                          </div>

                                    </div>
                              </div>
                              <div className={style.rightCol}>
                                    <Button
                                          text="Сформировать"
                                    >
                                          <FiCheck />
                                    </Button>
                                    <Button
                                          text="Печать"
                                    >
                                          <FiPrinter/>
                                    </Button>
                                    <Dropdown
                                          dropDownItems={dropDownItems}
                                          selectedItem={selectedItem}
                                          setSelectedItem = {setSelectedItem}
                                    />
                              </div>
                        </div>

                  </div>
            </div>
      )
}

export default PrintWindow;