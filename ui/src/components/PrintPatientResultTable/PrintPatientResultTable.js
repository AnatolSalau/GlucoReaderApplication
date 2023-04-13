import {useState} from "react";

import style from './PrintPatientResultTable.module.css'
import PrintPatientResultColumn from "./PrintPatientResultColumn";

function PrintPatientResultTable() {

      console.log("__________________________________________________________________")
      console.log("PrintPatientResultTable RENDER")
      const [columheaders, setColumheaders] = useState(
            {
                  data: "Дата приема",
                  dataMeasurement: "Дата съема показания",
                  time: "Время съема показания",
                  measurement: "Показание ммоль/л",
                  type: "Маркер до/после еды",
                  mark: "Наличие метки"
            }
      );

      return (
            <div className={style.table}>
                  <div
                        className={style.scrollableWrapper}
                  >
                        <div className={style.wrapperTable} >
                              {
                                    Object.entries(columheaders).map(([columnHeaderKey, columnHeaderValue], index) => {
                                          return (
                                                <PrintPatientResultColumn
                                                      key={index}
                                                      columnIndex={index}
                                                      columnHeaderKey={columnHeaderKey}
                                                      columnHeaderValue={columnHeaderValue}
                                                />
                                          )
                                    })
                              }
                        </div>

                  </div>
            </div>

      )
}

export default PrintPatientResultTable;