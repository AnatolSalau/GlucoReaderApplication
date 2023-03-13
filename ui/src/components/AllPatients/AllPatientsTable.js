import style from './AllPatientsTable.module.css'
import allPatients from "../../data/allPatients.json";
import {useState} from "react";

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

      const changeStyle = (defaultStyle, newStyle) => {

      };

      const columnHeaderClickHandler = (e) => {
            console.log(e)
      };

      return (
            <div className={style.table}>
                  <div
                        className={style.wrapper}

                  >
                        <div className={style.wrapperTable} >
                              {
                                    Object.entries(columheaders).map(([columnHeaderKey, columnHeaderValue], index) => {
                                          return (
                                                <div className={style.column} key={index}>
                                                      <div
                                                            className={style.columnHeader}
                                                            onClick={columnHeaderClickHandler}
                                                      >
                                                            {columnHeaderValue}
                                                      </div>
                                                      {
                                                            allPatients.map((patient, index) => {
                                                                  return (
                                                                        <div
                                                                              className={style.columnRow}
                                                                              key={index}
                                                                        >
                                                                              {patient[columnHeaderKey]}
                                                                        </div>
                                                                  )
                                                            })
                                                      }
                                                </div>
                                          )
                                    })
                              }
                        </div>

                  </div>
            </div>

      )
}

export default AllPatientsTable;