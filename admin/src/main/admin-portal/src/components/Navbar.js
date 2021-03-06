import React, { useState } from 'react'
import { Link } from 'react-router-dom'
import { FaBars, FaTimes } from 'react-icons/fa'
import { MdLocalLibrary } from 'react-icons/md'
import './Navbar.css';
import { IconContext } from 'react-icons/lib';

function Navbar() {
    const [click, setClick] = useState(false)

    const handleClick = () => setClick(!click)

    const closeMobileMenu = () => setClick(false);


    return (
        <IconContext.Provider value = {{color: '#fff'}}>
        <div className="navbar">
            <div className="navbar-container container">
                <Link to='/' className="navbar-logo" onClick={closeMobileMenu}>
                    <MdLocalLibrary className='navbar-icon' />
                    Admin Portal
                </Link>
                <div className="menu-icon" onClick={handleClick}>
                    {click ? <FaTimes /> : <FaBars />}
                </div>
                <ul className={click ? 'nav-menu active' : 'nav-menu'}>
                    <li className="nav-item" onClick={closeMobileMenu}>
                        <Link to='/' className='nav-links'>
                        Home
                        </Link>
                    </li>
                    <li className="nav-item" onClick={closeMobileMenu}>
                        <Link to='/' className='nav-links'>
                        Attendance
                        </Link>
                    </li>
                  
                </ul>
            </div>
        </div>
        </IconContext.Provider>
    );
}

export default Navbar
