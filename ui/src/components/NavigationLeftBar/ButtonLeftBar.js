import style from './ButtonLeftBar.module.css'

function ButtonLeftBar({
                             children,
                             switchWindowHandler,
                             windowComponentName,
                             activeButtonName
})
{
      const setStyleByActiveButtonName = () => {
            if (windowComponentName === activeButtonName) {
                  return style.activeButton
            } else {
                  return style.button
            }
      }

      return (
            <button
                  onClick={() => {switchWindowHandler(windowComponentName)}}
                  className={setStyleByActiveButtonName()}

            >
                  {children}
            </button>
      );
}

export default ButtonLeftBar;