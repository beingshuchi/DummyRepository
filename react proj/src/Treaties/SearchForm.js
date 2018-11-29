import React from 'react';
import { Fa} from "mdbreact";
import Dropdown from 'react-dropdown';
//import Dropdown from 'primereact/components/dropdown/Dropdown';

export default class SearchForm extends React.Component{

  constructor(){
    super();
    this.state={
        status:null
    };
    this.onStatusChange=this.onStatusChange.bind(this);
}

onStatusChange=(e)=>{
    const statusChange=e.value;
    this.setState({
        status: statusChange
        //status:e
    });
}

render(){

  const statusArr = [
    { label : 'Study', value: 'study'},
    { label : 'Finalized', value: 'finalized'},
    { label : 'Prospect', value: 'prospect'},
    { label : 'To Validate', value: 'To Validate'},
    { label : 'Authorized', value: 'authorized'},
    { label : 'Renewed', value: 'renewed'},
    { label : 'accepted', value: 'accepted'},
    { label : 'All', value: ''}
    ];

    return(
      <div>
          
               <div className="p-grid p-nogutter">
                  <div className="p-col-12 p-md-1 p-lg-3 ">
                            <label className="label" ><b>Legder</b></label><br/>
                            
                           
                            <input className="in"  id="ledgerName"  placeholder="Ledger Name" />
                            <button type="submit" className="b2">
                            <Fa icon="search" />
                            </button>
                          
                  </div>
                   <div className="p-col-12 p-md-2 p-lg-3">
                       <label className="label"><b>UW Unit</b></label><br/>
                    <input className="in" id="uwUnit" placeholder="UW Unit Name" />
                      <button type="submit" className="b2">
                    <Fa icon="search"/>
                    </button>
                  </div>
                  <div className="p-col-12 p-md-1 p-lg-3">
                 <label className="label"><b>Cedent Number</b></label><br/>
                 
                 <input className="in"   id="cedentNo"  placeholder="1234" />
                 </div>
                 <div className="p-col-12 p-md-1 p-lg-3">
          
                  <label className="label" ><b>Cedent Name</b></label><br/>
                  
                  <input  id="cedentName"  className="in" placeholder="Cedent Name" />
                  </div>
                
                <div className="p-col-12 p-md-6 p-lg-3">
            
                 <label className="label" ><b>Treaty Number</b></label><br/>
               
                 <input className="in" id="treatyNo" placeholder="Treaty Number" />
                 </div>
                <div className="p-col-12 p-md-1 p-lg-3">
            
                 <label className="label" ><b>Treaty Label</b></label><br/>
                
                 <input className="in"  id="treatyName" placeholder="Treaty Label" />
                 </div>
                 <div className="p-col-12 p-md-1 p-lg-3 d1">
                  <label className="label" ><b>Treaty Status</b></label><br/>
                  <Dropdown className="b4" value={this.state.status} options={statusArr} onChange={this.onStatusChange} placeholder="Select"/>
                 </div>
                 </div>
                  
                 </div>
    );
}
}