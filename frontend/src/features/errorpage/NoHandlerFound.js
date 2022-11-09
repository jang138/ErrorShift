import Footer from '../../common/footer/Footer'
import SideBar from '../../common/sidebar/SideBar'

function NoHandlerFound(){
    return(
        <div>
            <div className="overall-screen">
                <div>
                    <SideBar></SideBar>
                </div>
                <div style={{height:500, marginTop:80}}>
                    <h1>NoHandlerFound</h1>
                </div>
            </div>
            <Footer></Footer>
        </div>
    )
}
export default NoHandlerFound;