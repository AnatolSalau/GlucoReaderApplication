import style from './AllPatientsTable.module.css'
import allPatients from "../../data/allPatients.json";
import {useState} from "react";

function AllPatientsTable() {

      const [columheaders, setColumheaders] = useState(
            {
                  name: "ФИО",
                  age: "Возраст",
                  data: "Дата Рождения",
                  place: "Адрес",
                  phone: "Tелефон",
                  number: "Номер карты"
            }
      );

      return (
            <div className={style.table}>
                  <div className={style.tableHeader}>
                        {
                              Object.values(columheaders).map((value) => {
                                    return(
                                          <div
                                                key={value}
                                          >
                                                {value}
                                          </div>
                                    );
                              })
                        }
                  </div>
                  {
                        allPatients.map((patient) => {
                              return (
                                    <div
                                          className={style.tableRow}
                                          key={patient.id}
                                    >
                                          {
                                                Object.values(patient).map((value, index) => {
                                                      return (
                                                            <div
                                                                  key={index}
                                                            >
                                                                  {value}
                                                            </div>
                                                      )
                                                })
                                          }
                                    </div>
                              )
                        })
                  }
            </div>
      )
}

export default AllPatientsTable;