import {useState} from "react";

import { FiFilter } from 'react-icons/fi'

import { BiSortAlt2 } from 'react-icons/bi'
import style from "./PrintPatientResultColumn.module.css";
import allPatients from "../../data/patientResults.json";

function PrintPatientResultColumn({columnIndex, columnHeaderKey, columnHeaderValue}) {
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

      const changeMarkTypeRow = (columnHeaderKey, rowValue) => {
            if (columnHeaderKey === 'type') {
                  if (rowValue === null) {
                        return (
                              <div className={style.columnRowMark}>
                                    <div className={style.markOfType}>
                                          <img
                                                className={style.markOfType}
                                                src={require('../../svg/empty.svg').default}
                                          />
                                    </div>
                                    натощак
                              </div>
                        )
                  }
                  if (rowValue === true) {
                        return (
                              <div className={style.columnRowMark}>
                                          <img
                                                className={style.markOfType}
                                                src={require('../../svg/after.svg').default}
                                          />
                                    после еды
                              </div>
                        )
                  }
                  if (rowValue === false) {
                        return (
                              <div className={style.columnRowMark}>
                                          <img
                                                className={style.checkMark}
                                                src={require('../../svg/before.svg').default}
                                          />
                                    до еды
                              </div>
                        )
                  }
            }
            return null;
      }

      const changeMarkRow = (columnHeaderKey, rowValue) => {
            if (columnHeaderKey === 'mark') {
                  if (rowValue === true) {
                        return (
                              <div className={style.columnRowMark}>
                                          <img
                                                className={style.checkMark}
                                                src={require('../../svg/mark.svg').default}
                                          />
                              </div>
                        )
                  }
            }
      }

      return (
            <div className={style.column}>
                  <div
                        className={style.columnHeader}
                  >
                        {columnHeaderValue}
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
                                          {
                                                changeMarkTypeRow(columnHeaderKey, patient[columnHeaderKey])
                                          }
                                          {
                                                changeMarkRow(columnHeaderKey, patient[columnHeaderKey])
                                          }
                                          {patient[columnHeaderKey]}
                                    </div>
                              )
                        })
                  }
            </div>
      );
}

export default PrintPatientResultColumn;