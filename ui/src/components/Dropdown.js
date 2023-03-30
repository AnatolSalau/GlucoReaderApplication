import style from './Dropdown.module.css'
import {VscTriangleDown} from "react-icons/vsc";
import {useState} from "react";

function Dropdown({dropDownItems, selectedItem, setSelectedItem}) {

      const [isActive, setIsActive] = useState(false);


      return (
            <div className={style.dropdown}>
                  <div
                        className={style.dropdownBtn}
                  >
                        {selectedItem}
                        <div
                              className={style.svgWrapper}
                              onClick={(e) => {
                                    setIsActive(!isActive);
                              }}
                        >
                              <VscTriangleDown />
                        </div>
                  </div>
                  {
                        isActive && (
                              <div className={style.dropdownContent}>
                                    {dropDownItems.map((item, index) => {
                                          return (
                                                <div
                                                      key={index}
                                                      className={style.dropdownItem}
                                                      onClick={(event) => {
                                                            setSelectedItem(item);
                                                            setIsActive(!isActive);
                                                      }}
                                                >
                                                      {item}
                                                </div>
                                          )
                                    })}
                              </div>
                        )
                  }
            </div>
      );
}

export default Dropdown;