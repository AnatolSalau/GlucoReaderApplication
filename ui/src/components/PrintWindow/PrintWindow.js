import style from "../PrintWindow/PrintWindow.module.css";
import Dropdown from "../Dropdown";
import {useState} from "react";


function PrintWindow() {
      const dropDownItems = ['Линейный график', 'Круговая диаграмма', 'Еще какой то график'];
      const [selectedItem, setSelectedItem] = useState(dropDownItems[0]);
      return(
            <div
                  className={style.printWindow}
            >
                  PrintWindow
                  <Dropdown
                        dropDownItems={dropDownItems}
                        selectedItem={selectedItem}
                        setSelectedItem = {setSelectedItem}
                  />
            </div>
      )
}

export default PrintWindow;