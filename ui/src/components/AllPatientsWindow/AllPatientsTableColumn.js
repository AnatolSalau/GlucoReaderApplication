import style from "./AllPatientsTableColumn.module.css";
import allPatients from "../../data/allPatients.json";
import {useState} from "react";

function AllPatientsTableColumn({columnHeaderKey, columnHeaderValue}) {

      let [isActive, setIsActive] = useState(false);

      const clickHandler = (event) => {
            setIsActive(true);
      }

      const changeStyleColumn = (isActive) => {
            if (isActive === true) {
                  return style.columnActive;
            }
            return style.column;
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
                        onClick={clickHandler}
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