
import { HiOutlineChevronLeft, HiOutlineChevronRight, HiOutlineX } from 'react-icons/hi' ;
import style from './TabsBar.module.css'
import Tab from './Tab'
import TabNavButton from "./TabNavButton";


function TabsBar() {
      return (
            <div
                  className={style.tabsBar}
            >
                  <TabNavButton>
                        <HiOutlineChevronLeft />
                  </TabNavButton>
                  <Tab>
                        <HiOutlineX />
                  </Tab>
                  <Tab>
                        <HiOutlineX />
                  </Tab>
                  <Tab>
                        <HiOutlineX />
                  </Tab>
                  <TabNavButton>
                        <HiOutlineChevronRight />
                  </TabNavButton>
            </div>
      );
}

export default TabsBar;