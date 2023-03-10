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
                  number: "Номер карты"
            }
      );
/*
      return (
            <div className={style.table}>
                  <div className={style.wrapper}>
                        {
                              Object.entries(columheaders).map(([columnHeaderKey, columnHeaderValue], index) => {
                                    return (
                                          <div>{columnHeaderValue}</div>
                                    )
                              })
                        }
                        {
                              allPatients.map((patient, index) => {
                                    return (
                                          <div className="table-row">
                                                {
                                                      Object.entries(columheaders).map(([columnHeaderKey, columnHeaderValue], index) => {
                                                            return (
                                                                  <div>{patient[columnHeaderKey]}</div>
                                                            )
                                                      })
                                                }

                                          </div>
                                    )
                              })
                        }
                  </div>
            </div>

      )*/

            return (
                  <div className={style.table}>
                        <div
                              className={style.wrapper}
                        >
                              {
                                    Object.entries(columheaders).map(([columnHeaderKey, columnHeaderValue], index) => {
                                          return (
                                                <div className={style.column} key={index}>
                                                      <div className={style.columnHeader}>
                                                            {columnHeaderValue}
                                                      </div>
                                                      {
                                                            allPatients.map((patient, index) => {
                                                                  return (
                                                                        <div
                                                                              className={style.columnRow}
                                                                              key={patient.id}
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

            )
}

export default AllPatientsTable;