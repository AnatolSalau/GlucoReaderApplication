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
                  {
                       Object.entries(columheaders).map(([columnHeaderKey, columnHeaderValue]) => {
                             return (
                                   <div className={style.column}>
                                         {/*{objValue}*/}
                                         <div className={style.columnHeader}>{columnHeaderValue}</div>
                                         {
                                               allPatients.map((patient) => {
                                                      return (
                                                            <div
                                                                  className={style.columnRow}
                                                            >
                                                                  {patient.id}
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