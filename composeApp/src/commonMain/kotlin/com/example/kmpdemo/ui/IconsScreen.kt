package com.example.kmpdemo.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.automirrored.filled.ExitToApp
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material.icons.automirrored.outlined.ArrowForward
import androidx.compose.material.icons.automirrored.outlined.ExitToApp
import androidx.compose.material.icons.automirrored.outlined.KeyboardArrowLeft
import androidx.compose.material.icons.automirrored.outlined.KeyboardArrowRight
import androidx.compose.material.icons.automirrored.outlined.List
import androidx.compose.material.icons.automirrored.outlined.Send
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.automirrored.rounded.ArrowForward
import androidx.compose.material.icons.automirrored.rounded.ExitToApp
import androidx.compose.material.icons.automirrored.rounded.KeyboardArrowLeft
import androidx.compose.material.icons.automirrored.rounded.KeyboardArrowRight
import androidx.compose.material.icons.automirrored.rounded.List
import androidx.compose.material.icons.automirrored.rounded.Send
import androidx.compose.material.icons.automirrored.sharp.ArrowBack
import androidx.compose.material.icons.automirrored.sharp.ArrowForward
import androidx.compose.material.icons.automirrored.sharp.ExitToApp
import androidx.compose.material.icons.automirrored.sharp.KeyboardArrowLeft
import androidx.compose.material.icons.automirrored.sharp.KeyboardArrowRight
import androidx.compose.material.icons.automirrored.sharp.List
import androidx.compose.material.icons.automirrored.sharp.Send
import androidx.compose.material.icons.automirrored.twotone.ArrowBack
import androidx.compose.material.icons.automirrored.twotone.ArrowForward
import androidx.compose.material.icons.automirrored.twotone.ExitToApp
import androidx.compose.material.icons.automirrored.twotone.KeyboardArrowLeft
import androidx.compose.material.icons.automirrored.twotone.KeyboardArrowRight
import androidx.compose.material.icons.automirrored.twotone.List
import androidx.compose.material.icons.automirrored.twotone.Send
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.AddCircle
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowForward
import androidx.compose.material.icons.outlined.Build
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material.icons.outlined.Clear
import androidx.compose.material.icons.outlined.Close
import androidx.compose.material.icons.outlined.Create
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.Done
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.ExitToApp
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material.icons.outlined.KeyboardArrowLeft
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.material.icons.outlined.KeyboardArrowUp
import androidx.compose.material.icons.outlined.List
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material.icons.outlined.Place
import androidx.compose.material.icons.outlined.PlayArrow
import androidx.compose.material.icons.outlined.Refresh
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material.icons.outlined.ThumbUp
import androidx.compose.material.icons.outlined.Warning
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.AddCircle
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.ArrowDropDown
import androidx.compose.material.icons.rounded.ArrowForward
import androidx.compose.material.icons.rounded.Build
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Check
import androidx.compose.material.icons.rounded.CheckCircle
import androidx.compose.material.icons.rounded.Clear
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.Create
import androidx.compose.material.icons.rounded.DateRange
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.material.icons.rounded.Done
import androidx.compose.material.icons.rounded.Edit
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.ExitToApp
import androidx.compose.material.icons.rounded.Face
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.FavoriteBorder
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.material.icons.rounded.KeyboardArrowLeft
import androidx.compose.material.icons.rounded.KeyboardArrowRight
import androidx.compose.material.icons.rounded.KeyboardArrowUp
import androidx.compose.material.icons.rounded.List
import androidx.compose.material.icons.rounded.LocationOn
import androidx.compose.material.icons.rounded.Lock
import androidx.compose.material.icons.rounded.MailOutline
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Place
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material.icons.rounded.Refresh
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.Send
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material.icons.rounded.ThumbUp
import androidx.compose.material.icons.rounded.Warning
import androidx.compose.material.icons.sharp.AccountBox
import androidx.compose.material.icons.sharp.AccountCircle
import androidx.compose.material.icons.sharp.Add
import androidx.compose.material.icons.sharp.AddCircle
import androidx.compose.material.icons.sharp.ArrowBack
import androidx.compose.material.icons.sharp.ArrowDropDown
import androidx.compose.material.icons.sharp.ArrowForward
import androidx.compose.material.icons.sharp.Build
import androidx.compose.material.icons.sharp.Call
import androidx.compose.material.icons.sharp.Check
import androidx.compose.material.icons.sharp.CheckCircle
import androidx.compose.material.icons.sharp.Clear
import androidx.compose.material.icons.sharp.Close
import androidx.compose.material.icons.sharp.Create
import androidx.compose.material.icons.sharp.DateRange
import androidx.compose.material.icons.sharp.Delete
import androidx.compose.material.icons.sharp.Done
import androidx.compose.material.icons.sharp.Edit
import androidx.compose.material.icons.sharp.Email
import androidx.compose.material.icons.sharp.ExitToApp
import androidx.compose.material.icons.sharp.Face
import androidx.compose.material.icons.sharp.Favorite
import androidx.compose.material.icons.sharp.FavoriteBorder
import androidx.compose.material.icons.sharp.Home
import androidx.compose.material.icons.sharp.Info
import androidx.compose.material.icons.sharp.KeyboardArrowDown
import androidx.compose.material.icons.sharp.KeyboardArrowLeft
import androidx.compose.material.icons.sharp.KeyboardArrowRight
import androidx.compose.material.icons.sharp.KeyboardArrowUp
import androidx.compose.material.icons.sharp.List
import androidx.compose.material.icons.sharp.LocationOn
import androidx.compose.material.icons.sharp.Lock
import androidx.compose.material.icons.sharp.MailOutline
import androidx.compose.material.icons.sharp.Menu
import androidx.compose.material.icons.sharp.MoreVert
import androidx.compose.material.icons.sharp.Notifications
import androidx.compose.material.icons.sharp.Person
import androidx.compose.material.icons.sharp.Phone
import androidx.compose.material.icons.sharp.Place
import androidx.compose.material.icons.sharp.PlayArrow
import androidx.compose.material.icons.sharp.Refresh
import androidx.compose.material.icons.sharp.Search
import androidx.compose.material.icons.sharp.Send
import androidx.compose.material.icons.sharp.Settings
import androidx.compose.material.icons.sharp.Share
import androidx.compose.material.icons.sharp.ShoppingCart
import androidx.compose.material.icons.sharp.Star
import androidx.compose.material.icons.sharp.ThumbUp
import androidx.compose.material.icons.sharp.Warning
import androidx.compose.material.icons.twotone.AccountBox
import androidx.compose.material.icons.twotone.AccountCircle
import androidx.compose.material.icons.twotone.Add
import androidx.compose.material.icons.twotone.AddCircle
import androidx.compose.material.icons.twotone.ArrowBack
import androidx.compose.material.icons.twotone.ArrowDropDown
import androidx.compose.material.icons.twotone.ArrowForward
import androidx.compose.material.icons.twotone.Build
import androidx.compose.material.icons.twotone.Call
import androidx.compose.material.icons.twotone.Check
import androidx.compose.material.icons.twotone.CheckCircle
import androidx.compose.material.icons.twotone.Clear
import androidx.compose.material.icons.twotone.Close
import androidx.compose.material.icons.twotone.Create
import androidx.compose.material.icons.twotone.DateRange
import androidx.compose.material.icons.twotone.Delete
import androidx.compose.material.icons.twotone.Done
import androidx.compose.material.icons.twotone.Edit
import androidx.compose.material.icons.twotone.Email
import androidx.compose.material.icons.twotone.ExitToApp
import androidx.compose.material.icons.twotone.Face
import androidx.compose.material.icons.twotone.Favorite
import androidx.compose.material.icons.twotone.FavoriteBorder
import androidx.compose.material.icons.twotone.Home
import androidx.compose.material.icons.twotone.Info
import androidx.compose.material.icons.twotone.KeyboardArrowDown
import androidx.compose.material.icons.twotone.KeyboardArrowLeft
import androidx.compose.material.icons.twotone.KeyboardArrowRight
import androidx.compose.material.icons.twotone.KeyboardArrowUp
import androidx.compose.material.icons.twotone.List
import androidx.compose.material.icons.twotone.LocationOn
import androidx.compose.material.icons.twotone.Lock
import androidx.compose.material.icons.twotone.MailOutline
import androidx.compose.material.icons.twotone.Menu
import androidx.compose.material.icons.twotone.MoreVert
import androidx.compose.material.icons.twotone.Notifications
import androidx.compose.material.icons.twotone.Person
import androidx.compose.material.icons.twotone.Phone
import androidx.compose.material.icons.twotone.Place
import androidx.compose.material.icons.twotone.PlayArrow
import androidx.compose.material.icons.twotone.Refresh
import androidx.compose.material.icons.twotone.Search
import androidx.compose.material.icons.twotone.Send
import androidx.compose.material.icons.twotone.Settings
import androidx.compose.material.icons.twotone.Share
import androidx.compose.material.icons.twotone.ShoppingCart
import androidx.compose.material.icons.twotone.Star
import androidx.compose.material.icons.twotone.ThumbUp
import androidx.compose.material.icons.twotone.Warning
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun IconsScreen() {
    val allIconsData = listOf(
        IconData(
            "Star",
            Icons.Default.Star,
            Icons.Filled.Star,
            Icons.Outlined.Star,
            Icons.Rounded.Star,
            Icons.Sharp.Star,
            Icons.TwoTone.Star
        ),
        IconData(
            "Info",
            Icons.Default.Info,
            Icons.Filled.Info,
            Icons.Outlined.Info,
            Icons.Rounded.Info,
            Icons.Sharp.Info,
            Icons.TwoTone.Info
        ),
        IconData(
            "Favorite",
            Icons.Default.Favorite,
            Icons.Filled.Favorite,
            Icons.Outlined.Favorite,
            Icons.Rounded.Favorite,
            Icons.Sharp.Favorite,
            Icons.TwoTone.Favorite
        ),
        IconData(
            "Home",
            Icons.Default.Home,
            Icons.Filled.Home,
            Icons.Outlined.Home,
            Icons.Rounded.Home,
            Icons.Sharp.Home,
            Icons.TwoTone.Home
        ),
        IconData(
            "AccountCircle",
            Icons.Default.AccountCircle,
            Icons.Filled.AccountCircle,
            Icons.Outlined.AccountCircle,
            Icons.Rounded.AccountCircle,
            Icons.Sharp.AccountCircle,
            Icons.TwoTone.AccountCircle
        ),
        IconData(
            "Delete",
            Icons.Default.Delete,
            Icons.Filled.Delete,
            Icons.Outlined.Delete,
            Icons.Rounded.Delete,
            Icons.Sharp.Delete,
            Icons.TwoTone.Delete
        ),
        IconData(
            "Search",
            Icons.Default.Search,
            Icons.Filled.Search,
            Icons.Outlined.Search,
            Icons.Rounded.Search,
            Icons.Sharp.Search,
            Icons.TwoTone.Search
        ),
        IconData(
            "Settings",
            Icons.Default.Settings,
            Icons.Filled.Settings,
            Icons.Outlined.Settings,
            Icons.Rounded.Settings,
            Icons.Sharp.Settings,
            Icons.TwoTone.Settings
        ),
        IconData(
            "Add",
            Icons.Default.Add,
            Icons.Filled.Add,
            Icons.Outlined.Add,
            Icons.Rounded.Add,
            Icons.Sharp.Add,
            Icons.TwoTone.Add
        ),
        IconData(
            "AddCircle",
            Icons.Default.AddCircle,
            Icons.Filled.AddCircle,
            Icons.Outlined.AddCircle,
            Icons.Rounded.AddCircle,
            Icons.Sharp.AddCircle,
            Icons.TwoTone.AddCircle
        ),
        IconData(
            "AccountBox",
            Icons.Default.AccountBox,
            Icons.Filled.AccountBox,
            Icons.Outlined.AccountBox,
            Icons.Rounded.AccountBox,
            Icons.Sharp.AccountBox,
            Icons.TwoTone.AccountBox
        ),
        IconData(
            "ArrowDropDown",
            Icons.Default.ArrowDropDown,
            Icons.Filled.ArrowDropDown,
            Icons.Outlined.ArrowDropDown,
            Icons.Rounded.ArrowDropDown,
            Icons.Sharp.ArrowDropDown,
            Icons.TwoTone.ArrowDropDown
        ),
        IconData(
            "Build",
            Icons.Default.Build,
            Icons.Filled.Build,
            Icons.Outlined.Build,
            Icons.Rounded.Build,
            Icons.Sharp.Build,
            Icons.TwoTone.Build
        ),
        IconData(
            "ArrowBack",
            Icons.AutoMirrored.Default.ArrowBack,
            Icons.AutoMirrored.Filled.ArrowBack,
            Icons.AutoMirrored.Outlined.ArrowBack,
            Icons.AutoMirrored.Rounded.ArrowBack,
            Icons.AutoMirrored.Sharp.ArrowBack,
            Icons.AutoMirrored.TwoTone.ArrowBack
        ),
        IconData(
            "ArrowForward",
            Icons.AutoMirrored.Default.ArrowForward,
            Icons.AutoMirrored.Filled.ArrowForward,
            Icons.AutoMirrored.Outlined.ArrowForward,
            Icons.AutoMirrored.Rounded.ArrowForward,
            Icons.AutoMirrored.Sharp.ArrowForward,
            Icons.AutoMirrored.TwoTone.ArrowForward
        ),
        IconData(
            "Call",
            Icons.Default.Call,
            Icons.Filled.Call,
            Icons.Outlined.Call,
            Icons.Rounded.Call,
            Icons.Sharp.Call,
            Icons.TwoTone.Call
        ),
        IconData(
            "Create",
            Icons.Default.Create,
            Icons.Filled.Create,
            Icons.Outlined.Create,
            Icons.Rounded.Create,
            Icons.Sharp.Create,
            Icons.TwoTone.Create
        ),
        IconData(
            "Check",
            Icons.Default.Check,
            Icons.Filled.Check,
            Icons.Outlined.Check,
            Icons.Rounded.Check,
            Icons.Sharp.Check,
            Icons.TwoTone.Check
        ),
        IconData(
            "Clear",
            Icons.Default.Clear,
            Icons.Filled.Clear,
            Icons.Outlined.Clear,
            Icons.Rounded.Clear,
            Icons.Sharp.Clear,
            Icons.TwoTone.Clear
        ),
        IconData(
            "Close",
            Icons.Default.Close,
            Icons.Filled.Close,
            Icons.Outlined.Close,
            Icons.Rounded.Close,
            Icons.Sharp.Close,
            Icons.TwoTone.Close
        ),
        IconData(
            "CheckCircle",
            Icons.Default.CheckCircle,
            Icons.Filled.CheckCircle,
            Icons.Outlined.CheckCircle,
            Icons.Rounded.CheckCircle,
            Icons.Sharp.CheckCircle,
            Icons.TwoTone.CheckCircle
        ),
        IconData(
            "Done",
            Icons.Default.Done,
            Icons.Filled.Done,
            Icons.Outlined.Done,
            Icons.Rounded.Done,
            Icons.Sharp.Done,
            Icons.TwoTone.Done
        ),
        IconData(
            "DateRange",
            Icons.Default.DateRange,
            Icons.Filled.DateRange,
            Icons.Outlined.DateRange,
            Icons.Rounded.DateRange,
            Icons.Sharp.DateRange,
            Icons.TwoTone.DateRange
        ),
        IconData(
            "Edit",
            Icons.Default.Edit,
            Icons.Filled.Edit,
            Icons.Outlined.Edit,
            Icons.Rounded.Edit,
            Icons.Sharp.Edit,
            Icons.TwoTone.Edit
        ),
        IconData(
            "Email",
            Icons.Default.Email,
            Icons.Filled.Email,
            Icons.Outlined.Email,
            Icons.Rounded.Email,
            Icons.Sharp.Email,
            Icons.TwoTone.Email
        ),
        IconData(
            "ExitToApp",
            Icons.AutoMirrored.Default.ExitToApp,
            Icons.AutoMirrored.Filled.ExitToApp,
            Icons.AutoMirrored.Outlined.ExitToApp,
            Icons.AutoMirrored.Rounded.ExitToApp,
            Icons.AutoMirrored.Sharp.ExitToApp,
            Icons.AutoMirrored.TwoTone.ExitToApp
        ),
        IconData(
            "Face",
            Icons.Default.Face,
            Icons.Filled.Face,
            Icons.Outlined.Face,
            Icons.Rounded.Face,
            Icons.Sharp.Face,
            Icons.TwoTone.Face
        ),
        IconData(
            "FavoriteBorder",
            Icons.Default.FavoriteBorder,
            Icons.Filled.FavoriteBorder,
            Icons.Outlined.FavoriteBorder,
            Icons.Rounded.FavoriteBorder,
            Icons.Sharp.FavoriteBorder,
            Icons.TwoTone.FavoriteBorder
        ),
        IconData(
            "KeyboardArrowUp",
            Icons.Default.KeyboardArrowUp,
            Icons.Filled.KeyboardArrowUp,
            Icons.Outlined.KeyboardArrowUp,
            Icons.Rounded.KeyboardArrowUp,
            Icons.Sharp.KeyboardArrowUp,
            Icons.TwoTone.KeyboardArrowUp
        ),
        IconData(
            "KeyboardArrowDown",
            Icons.Default.KeyboardArrowDown,
            Icons.Filled.KeyboardArrowDown,
            Icons.Outlined.KeyboardArrowDown,
            Icons.Rounded.KeyboardArrowDown,
            Icons.Sharp.KeyboardArrowDown,
            Icons.TwoTone.KeyboardArrowDown
        ),
        IconData(
            "KeyboardArrowLeft",
            Icons.AutoMirrored.Default.KeyboardArrowLeft,
            Icons.AutoMirrored.Filled.KeyboardArrowLeft,
            Icons.AutoMirrored.Outlined.KeyboardArrowLeft,
            Icons.AutoMirrored.Rounded.KeyboardArrowLeft,
            Icons.AutoMirrored.Sharp.KeyboardArrowLeft,
            Icons.AutoMirrored.TwoTone.KeyboardArrowLeft
        ),
        IconData(
            "KeyboardArrowRight",
            Icons.AutoMirrored.Default.KeyboardArrowRight,
            Icons.AutoMirrored.Filled.KeyboardArrowRight,
            Icons.AutoMirrored.Outlined.KeyboardArrowRight,
            Icons.AutoMirrored.Rounded.KeyboardArrowRight,
            Icons.AutoMirrored.Sharp.KeyboardArrowRight,
            Icons.AutoMirrored.TwoTone.KeyboardArrowRight
        ),
        IconData(
            "List",
            Icons.AutoMirrored.Default.List,
            Icons.AutoMirrored.Filled.List,
            Icons.AutoMirrored.Outlined.List,
            Icons.AutoMirrored.Rounded.List,
            Icons.AutoMirrored.Sharp.List,
            Icons.AutoMirrored.TwoTone.List
        ),
        IconData(
            "Lock",
            Icons.Default.Lock,
            Icons.Filled.Lock,
            Icons.Outlined.Lock,
            Icons.Rounded.Lock,
            Icons.Sharp.Lock,
            Icons.TwoTone.Lock
        ),
        IconData(
            "LocationOn",
            Icons.Default.LocationOn,
            Icons.Filled.LocationOn,
            Icons.Outlined.LocationOn,
            Icons.Rounded.LocationOn,
            Icons.Sharp.LocationOn,
            Icons.TwoTone.LocationOn
        ),
        IconData(
            "Menu",
            Icons.Default.Menu,
            Icons.Filled.Menu,
            Icons.Outlined.Menu,
            Icons.Rounded.Menu,
            Icons.Sharp.Menu,
            Icons.TwoTone.Menu
        ),
        IconData(
            "MoreVert",
            Icons.Default.MoreVert,
            Icons.Filled.MoreVert,
            Icons.Outlined.MoreVert,
            Icons.Rounded.MoreVert,
            Icons.Sharp.MoreVert,
            Icons.TwoTone.MoreVert
        ),
        IconData(
            "MailOutline",
            Icons.Default.MailOutline,
            Icons.Filled.MailOutline,
            Icons.Outlined.MailOutline,
            Icons.Rounded.MailOutline,
            Icons.Sharp.MailOutline,
            Icons.TwoTone.MailOutline
        ),
        IconData(
            "Notifications",
            Icons.Default.Notifications,
            Icons.Filled.Notifications,
            Icons.Outlined.Notifications,
            Icons.Rounded.Notifications,
            Icons.Sharp.Notifications,
            Icons.TwoTone.Notifications
        ),
        IconData(
            "Person",
            Icons.Default.Person,
            Icons.Filled.Person,
            Icons.Outlined.Person,
            Icons.Rounded.Person,
            Icons.Sharp.Person,
            Icons.TwoTone.Person
        ),
        IconData(
            "Phone",
            Icons.Default.Phone,
            Icons.Filled.Phone,
            Icons.Outlined.Phone,
            Icons.Rounded.Phone,
            Icons.Sharp.Phone,
            Icons.TwoTone.Phone
        ),
        IconData(
            "Place",
            Icons.Default.Place,
            Icons.Filled.Place,
            Icons.Outlined.Place,
            Icons.Rounded.Place,
            Icons.Sharp.Place,
            Icons.TwoTone.Place
        ),
        IconData(
            "PlayArrow",
            Icons.Default.PlayArrow,
            Icons.Filled.PlayArrow,
            Icons.Outlined.PlayArrow,
            Icons.Rounded.PlayArrow,
            Icons.Sharp.PlayArrow,
            Icons.TwoTone.PlayArrow
        ),
        IconData(
            "Refresh",
            Icons.Default.Refresh,
            Icons.Filled.Refresh,
            Icons.Outlined.Refresh,
            Icons.Rounded.Refresh,
            Icons.Sharp.Refresh,
            Icons.TwoTone.Refresh
        ),
        IconData(
            "Send",
            Icons.AutoMirrored.Default.Send,
            Icons.AutoMirrored.Filled.Send,
            Icons.AutoMirrored.Outlined.Send,
            Icons.AutoMirrored.Rounded.Send,
            Icons.AutoMirrored.Sharp.Send,
            Icons.AutoMirrored.TwoTone.Send
        ),
        IconData(
            "Share",
            Icons.Default.Share,
            Icons.Filled.Share,
            Icons.Outlined.Share,
            Icons.Rounded.Share,
            Icons.Sharp.Share,
            Icons.TwoTone.Share
        ),
        IconData(
            "ShoppingCart",
            Icons.Default.ShoppingCart,
            Icons.Filled.ShoppingCart,
            Icons.Outlined.ShoppingCart,
            Icons.Rounded.ShoppingCart,
            Icons.Sharp.ShoppingCart,
            Icons.TwoTone.ShoppingCart
        ),
        IconData(
            "ThumbUp",
            Icons.Default.ThumbUp,
            Icons.Filled.ThumbUp,
            Icons.Outlined.ThumbUp,
            Icons.Rounded.ThumbUp,
            Icons.Sharp.ThumbUp,
            Icons.TwoTone.ThumbUp
        ),
        IconData(
            "Warning",
            Icons.Default.Warning,
            Icons.Filled.Warning,
            Icons.Outlined.Warning,
            Icons.Rounded.Warning,
            Icons.Sharp.Warning,
            Icons.TwoTone.Warning
        )
    )

    val categories = listOf("Icon Name", "Default", "Filled", "Outlined", "Rounded", "Sharp", "TwoTone")
    val scrollState = rememberScrollState()
    Column(Modifier.fillMaxSize().padding(16.dp)) {
        // Sticky header row (fixed at top)
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Icon Name",
                modifier = Modifier.weight(1.5f),
                style = MaterialTheme.typography.subtitle1,
            )
            categories.forEach { category ->
                Text(
                    text = category,
                    modifier = Modifier.weight(1f),
                    style = MaterialTheme.typography.subtitle1,
                    textAlign = TextAlign.Center
                )
            }
        }

        Spacer(Modifier.height(8.dp))

        Box(Modifier.weight(1f)) {
            Column(
                modifier = Modifier
                    .verticalScroll(scrollState)
                    .fillMaxWidth()
            ) {
                allIconsData.forEach { iconData ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = iconData.name,
                            modifier = Modifier.weight(1.5f),
                            maxLines = 1,
                            softWrap = false
                        )
                        Icon(
                            iconData.default,
                            contentDescription = "${iconData.name} Default",
                            modifier = Modifier.weight(1f).size(32.dp).padding(4.dp)
                        )
                        Icon(
                            iconData.filled,
                            contentDescription = "${iconData.name} Filled",
                            modifier = Modifier.weight(1f).size(32.dp).padding(4.dp)
                        )
                        Icon(
                            iconData.outlined,
                            contentDescription = "${iconData.name} Outlined",
                            modifier = Modifier.weight(1f).size(32.dp).padding(4.dp)
                        )
                        Icon(
                            iconData.rounded,
                            contentDescription = "${iconData.name} Rounded",
                            modifier = Modifier.weight(1f).size(32.dp).padding(4.dp)
                        )
                        Icon(
                            iconData.sharp,
                            contentDescription = "${iconData.name} Sharp",
                            modifier = Modifier.weight(1f).size(32.dp).padding(4.dp)
                        )
                        Icon(
                            iconData.twoTones,
                            contentDescription = "${iconData.name} TwoTone",
                            modifier = Modifier.weight(1f).size(32.dp).padding(4.dp)
                        )
                    }
                }
            }
        }
    }
}

data class IconData(
    val name: String,
    val default: ImageVector,
    val filled: ImageVector,
    val outlined: ImageVector,
    val rounded: ImageVector,
    val sharp: ImageVector,
    val twoTones: ImageVector
)