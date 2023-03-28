import {useState} from "react";

import { FiFilter } from 'react-icons/fi'

import { BiSortAlt2 } from 'react-icons/bi'
import style from "./PatientResultColumn.module.css";
import allPatients from "../../data/patientResults.json";

function PatientResultColumn({columnIndex, columnHeaderKey, columnHeaderValue}) {
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

      const changeStyleMeasurementRow = (columnHeaderKey, measurementValue) => {

            if (columnHeaderKey === 'measurement') {
                  if (measurementValue < 3.5) {
                        return style.columnRowMeasurementLess
                  }
                  if (measurementValue > 7) {
                        return style.columnRowMeasurementMore
                  }
                  return style.columnRowMeasurementNormal;
            }
            return style.columnRow;
      }

      return (
            <div className={changeStyleColumn(isActive)}>
                  <div
                        className={changeStyleHeader(isActive)}
                        onClick={toggleActive}
                  >
                        {columnHeaderValue}
                        <div className={style.filterWrapper}>
                              <FiFilter />
                        </div>
                        <div className={style.sortWrapper}>
                              <BiSortAlt2 />
                        </div>
                  </div>
                  {
                        allPatients.map((patient, index) => {
                              return (

                                    <div
                                          className={changeStyleMeasurementRow(
                                                columnHeaderKey,
                                                patient[columnHeaderKey]
                                          )}
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

export default PatientResultColumn;