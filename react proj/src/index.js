import React from 'react';
import ReactDOM from 'react-dom';
import "react-dropdown/style.css";
import "primeflex/primeflex.css";
import "primereact/components/card/Card.css";
import "primereact/components/dropdown/Dropdown.css";
import "primereact/components/paginator/Paginator.css";
import 'primereact/components/overlaypanel/OverlayPanel.css';
import "primereact/components/button/Button.css";
import "primereact/components/menu/Menu.css"
import './index.css';
import 'primereact/components/datatable/DataTable.css';
import TreatySearch from './Treaties/TreatySearch';
import TreatyTable from './Treaties/TreatyTable';
import * as serviceWorker from './serviceWorker';
import "font-awesome/css/font-awesome.min.css";
import "bootstrap-css-only/css/bootstrap.min.css";
import "mdbreact/dist/css/mdb.css";


ReactDOM.render(<TreatySearch />, document.getElementById('search'));
ReactDOM.render(<TreatyTable />, document.getElementById('table'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: http://bit.ly/CRA-PWA
serviceWorker.unregister();
