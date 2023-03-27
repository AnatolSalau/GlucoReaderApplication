import {useState} from "react";

import style from './AllPatientsTable.module.css'
import AllPatientsTableColumn from "./AllPatientsTableColumn";

function AllPatientsTable() {

      const [columheaders, setColumheaders] = useState(
            {
                  id: "№",
                  name: "ФИО",
                  age: "Возраст",
                  data: "Дата Рождения",
                  place: "Адрес",
                  phone: "Tелефон",
                  field1: "Номер карты",
                  field2: "Номер карты",
                  field3: "Номер карты",
                  field4: "Номер карты",
                  field5: "Номер карты",
                  field6: "Номер карты",
                  field7: "Номер карты",
                  field8: "Номер карты",
                  field9: "Номер карты",
                  field10: "Номер карты"
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
                                                <AllPatientsTableColumn
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

export default AllPatientsTable;