import {useState} from "react";

import style from "./AllPatientsTableColumn.module.css";
import allPatients from "../../data/allPatients.json";

function AllPatientsTableColumn({columnIndex, columnHeaderKey, columnHeaderValue}) {
      let [isActive, setIsActive] = useState(false);

      const toggleActive = (event) => {
            setIsActive(!isActive);
      }

      const changeStyleColumn = (isActive) => {
            return isActive ? style.columnActive : style.column;
      }

      const changeStyleHeader = (isActive) => {
            if (isActive === true) {
                  return style.columnHeaderActive;
            }
            return style.columnHeader;
      }

      return (
            <div className={changeStyleColumn(isActive)}>
                  <div
                        className={changeStyleHeader(isActive)}
                        onClick={toggleActive}
                  >
                        {columnHeaderValue}
                  </div>
                  {
                        allPatients.map((patient, index) => {
                              return (
                                    <div
                                          className={style.columnRow}
                                          key={index}
                                          onClick={() => {
                                                console.log(patient);
                                          }}
                                    >
                                          {patient[columnHeaderKey]}
                                    </div>
                              )
                        })
                  }
            </div>
      );
}

export default AllPatientsTableColumn;