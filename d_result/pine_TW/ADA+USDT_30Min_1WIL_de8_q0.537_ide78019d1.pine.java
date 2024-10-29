//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: ADAUSDT_30Min_1WIL_e78019d1 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADAUSDT_30Min_1WIL_e78019d1", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADAUSDT_30Min_e78019d1(rangeHigh, rangeLow, midLine, sDev, lowerBand, wvf, Color_con1, colInt, Color_con2, upperBand)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( wvf <= 8.72962 )
		if( Color_con2 <= -1.12771 )
			if( wvf <= 2.74464 )
				if( Color_con1 <= -13.9898 )
					if( Color_con2 <= -9.89778 )
						if( Color_con2 <= -14.4226 )
							if( upperBand <= 29.1788 )
								if( sDev <= 14.6477 )
									ret := 1.000000 // buy
								if( sDev > 14.6477 )
									ret := 0.500000
							if( upperBand > 29.1788 )
								ret := 0.000000
						if( Color_con2 > -14.4226 )
							if( Color_con1 <= -20.3815 )
								if( lowerBand <= 2.25789 )
									ret := -0.777778 // sell
								if( lowerBand > 2.25789 )
									ret := 0.285714
							if( Color_con1 > -20.3815 )
								if( sDev <= 10.8788 )
									ret := 0.328000
								if( sDev > 10.8788 )
									ret := -0.272727
					if( Color_con2 > -9.89778 )
						if( wvf <= 1.12097 )
							if( sDev <= 9.42478 )
								ret := 1.000000 // buy
							if( sDev > 9.42478 )
								ret := 0.750000 // buy
						if( wvf > 1.12097 )
							if( Color_con2 <= -9.48168 )
								if( upperBand <= 16.591 )
									ret := -1.000000 // sell
								if( upperBand > 16.591 )
									ret := 0.166667
							if( Color_con2 > -9.48168 )
								if( upperBand <= 17.3701 )
									ret := 0.400000
								if( upperBand > 17.3701 )
									ret := 0.875000 // buy
				if( Color_con1 > -13.9898 )
					if( lowerBand <= 1.22626 )
						if( wvf <= 1.21942 )
							if( Color_con2 <= -1.88236 )
								if( wvf <= 0.746641 )
									ret := 0.037179
								if( wvf > 0.746641 )
									ret := -0.046048
							if( Color_con2 > -1.88236 )
								if( wvf <= 0.355969 )
									ret := 0.166873
								if( wvf > 0.355969 )
									ret := 0.056632
						if( wvf > 1.21942 )
							if( lowerBand <= -0.374043 )
								if( Color_con2 <= -2.90751 )
									ret := 0.051857
								if( Color_con2 > -2.90751 )
									ret := -0.206093
							if( lowerBand > -0.374043 )
								if( midLine <= 3.78025 )
									ret := 0.093657
								if( midLine > 3.78025 )
									ret := 0.276663
					if( lowerBand > 1.22626 )
						if( Color_con2 <= -7.5576 )
							if( upperBand <= 10.8808 )
								if( Color_con2 <= -10.0863 )
									ret := 0.000000
								if( Color_con2 > -10.0863 )
									ret := -0.911111 // sell
							if( upperBand > 10.8808 )
								if( lowerBand <= 1.49153 )
									ret := 0.500000
								if( lowerBand > 1.49153 )
									ret := -0.421053
						if( Color_con2 > -7.5576 )
							if( Color_con2 <= -2.19142 )
								if( midLine <= 4.45026 )
									ret := 0.169591
								if( midLine > 4.45026 )
									ret := -0.141479
							if( Color_con2 > -2.19142 )
								if( wvf <= 1.47796 )
									ret := 0.068182
								if( wvf > 1.47796 )
									ret := -0.158780
			if( wvf > 2.74464 )
				if( Color_con1 <= -1.54443 )
					if( Color_con2 <= -11.5167 )
						if( midLine <= 18.0577 )
							if( lowerBand <= 1.2024 )
								if( wvf <= 2.90599 )
									ret := -0.166667
								if( wvf > 2.90599 )
									ret := 0.678161
							if( lowerBand > 1.2024 )
								if( Color_con2 <= -14.9689 )
									ret := 0.782609 // buy
								if( Color_con2 > -14.9689 )
									ret := -0.386364
						if( midLine > 18.0577 )
							ret := -1.000000 // sell
					if( Color_con2 > -11.5167 )
						if( lowerBand <= 6.55392 )
							if( sDev <= 11.9623 )
								if( upperBand <= 8.71655 )
									ret := 0.147075
								if( upperBand > 8.71655 )
									ret := 0.031121
							if( sDev > 11.9623 )
								if( midLine <= 10.5667 )
									ret := -0.625000
								if( midLine > 10.5667 )
									ret := -1.000000 // sell
						if( lowerBand > 6.55392 )
							if( upperBand <= 16.4317 )
								if( midLine <= 11.6127 )
									ret := 0.720930 // buy
								if( midLine > 11.6127 )
									ret := -0.666667
							if( upperBand > 16.4317 )
								if( midLine <= 13.9385 )
									ret := 1.000000 // buy
								if( midLine > 13.9385 )
									ret := 0.666667
				if( Color_con1 > -1.54443 )
					if( lowerBand <= 2.69986 )
						if( sDev <= 2.31082 )
							if( Color_con1 <= -0.255186 )
								if( sDev <= 1.9606 )
									ret := 0.406048
								if( sDev > 1.9606 )
									ret := 0.074205
							if( Color_con1 > -0.255186 )
								if( lowerBand <= -0.13669 )
									ret := 0.328571
								if( lowerBand > -0.13669 )
									ret := -0.043478
						if( sDev > 2.31082 )
							if( Color_con2 <= -4.96323 )
								if( lowerBand <= -0.324148 )
									ret := -0.265306
								if( lowerBand > -0.324148 )
									ret := 0.380952
							if( Color_con2 > -4.96323 )
								if( midLine <= 4.5334 )
									ret := 0.567452
								if( midLine > 4.5334 )
									ret := -0.142857
					if( lowerBand > 2.69986 )
						if( Color_con1 <= -0.439617 )
							if( lowerBand <= 3.24914 )
								if( lowerBand <= 2.85878 )
									ret := -0.800000 // sell
								if( lowerBand > 2.85878 )
									ret := -1.000000 // sell
							if( lowerBand > 3.24914 )
								if( wvf <= 7.4704 )
									ret := 0.500000
								if( wvf > 7.4704 )
									ret := -0.833333 // sell
						if( Color_con1 > -0.439617 )
							ret := 0.400000
		if( Color_con2 > -1.12771 )
			if( Color_con1 <= 1.00619 )
				if( wvf <= 0.926159 )
					if( lowerBand <= -0.450958 )
						if( upperBand <= 2.58708 )
							if( Color_con1 <= -1.58606 )
								if( upperBand <= 2.40087 )
									ret := 0.750000 // buy
								if( upperBand > 2.40087 )
									ret := 0.966667 // buy
							if( Color_con1 > -1.58606 )
								ret := 0.000000
						if( upperBand > 2.58708 )
							ret := 0.000000
					if( lowerBand > -0.450958 )
						if( Color_con1 <= -0.759037 )
							if( sDev <= 1.62827 )
								if( midLine <= 1.8458 )
									ret := 0.124545
								if( midLine > 1.8458 )
									ret := 1.000000 // buy
							if( sDev > 1.62827 )
								if( sDev <= 1.79059 )
									ret := -0.650000
								if( sDev > 1.79059 )
									ret := 0.000000
						if( Color_con1 > -0.759037 )
							if( Color_con1 <= -0.751593 )
								if( wvf <= 0.652042 )
									ret := 0.047619
								if( wvf > 0.652042 )
									ret := -0.631579
							if( Color_con1 > -0.751593 )
								if( lowerBand <= 0.174631 )
									ret := 0.055955
								if( lowerBand > 0.174631 )
									ret := -0.078512
				if( wvf > 0.926159 )
					if( Color_con2 <= 0.613407 )
						if( upperBand <= 6.33293 )
							if( Color_con1 <= -1.78042 )
								if( lowerBand <= -0.185664 )
									ret := -0.342318
								if( lowerBand > -0.185664 )
									ret := -0.070894
							if( Color_con1 > -1.78042 )
								if( upperBand <= 4.98551 )
									ret := -0.014529
								if( upperBand > 4.98551 )
									ret := -0.099860
						if( upperBand > 6.33293 )
							if( Color_con1 <= -1.79576 )
								if( upperBand <= 6.7736 )
									ret := 0.265464
								if( upperBand > 6.7736 )
									ret := -0.021231
							if( Color_con1 > -1.79576 )
								if( sDev <= 2.37379 )
									ret := 0.413462
								if( sDev > 2.37379 )
									ret := 0.092593
					if( Color_con2 > 0.613407 )
						if( lowerBand <= 3.60733 )
							if( Color_con2 <= 5.20767 )
								if( wvf <= 8.40541 )
									ret := 0.065466
								if( wvf > 8.40541 )
									ret := -0.267442
							if( Color_con2 > 5.20767 )
								if( upperBand <= 7.64769 )
									ret := 0.250000
								if( upperBand > 7.64769 )
									ret := 0.925926 // buy
						if( lowerBand > 3.60733 )
							if( lowerBand <= 4.45581 )
								if( midLine <= 6.35772 )
									ret := 0.500000
								if( midLine > 6.35772 )
									ret := 1.000000 // buy
							if( lowerBand > 4.45581 )
								if( Color_con1 <= -0.655656 )
									ret := 0.250000
								if( Color_con1 > -0.655656 )
									ret := 0.750000 // buy
			if( Color_con1 > 1.00619 )
				if( Color_con2 <= 3.99016 )
					if( upperBand <= 5.09594 )
						if( Color_con1 <= 1.38844 )
							if( Color_con2 <= 2.50844 )
								if( lowerBand <= -0.420484 )
									ret := 0.372881
								if( lowerBand > -0.420484 )
									ret := 0.712121 // buy
							if( Color_con2 > 2.50844 )
								if( Color_con2 <= 3.15952 )
									ret := -0.071429
								if( Color_con2 > 3.15952 )
									ret := 0.705882 // buy
						if( Color_con1 > 1.38844 )
							if( upperBand <= 3.85267 )
								if( lowerBand <= -0.418677 )
									ret := 0.607143
								if( lowerBand > -0.418677 )
									ret := -0.111111
							if( upperBand > 3.85267 )
								if( Color_con1 <= 1.43233 )
									ret := -1.000000 // sell
								if( Color_con1 > 1.43233 )
									ret := -0.269231
					if( upperBand > 5.09594 )
						if( midLine <= 4.45572 )
							if( midLine <= 2.16525 )
								if( wvf <= 6.53619 )
									ret := 1.000000 // buy
								if( wvf > 6.53619 )
									ret := -0.833333 // sell
							if( midLine > 2.16525 )
								if( Color_con2 <= 3.44278 )
									ret := 0.797753 // buy
								if( Color_con2 > 3.44278 )
									ret := 0.451613
						if( midLine > 4.45572 )
							ret := -0.500000
				if( Color_con2 > 3.99016 )
					if( Color_con2 <= 5.681 )
						if( sDev <= 3.51122 )
							if( midLine <= 3.54793 )
								if( midLine <= 1.72567 )
									ret := 0.200000
								if( midLine > 1.72567 )
									ret := -0.794872 // sell
							if( midLine > 3.54793 )
								ret := 0.500000
						if( sDev > 3.51122 )
							if( wvf <= 7.87001 )
								if( wvf <= 7.20062 )
									ret := 0.000000
								if( wvf > 7.20062 )
									ret := 1.000000 // buy
							if( wvf > 7.87001 )
								if( Color_con1 <= 1.72978 )
									ret := 0.222222
								if( Color_con1 > 1.72978 )
									ret := -1.000000 // sell
					if( Color_con2 > 5.681 )
						ret := 1.000000 // buy
	if( wvf > 8.72962 )
		if( wvf <= 16.0334 )
			if( lowerBand <= 2.3467 )
				if( upperBand <= 22.9254 )
					if( lowerBand <= 0.888785 )
						if( Color_con2 <= -1.10519 )
							if( lowerBand <= 0.749955 )
								if( wvf <= 9.45433 )
									ret := 0.882353 // buy
								if( wvf > 9.45433 )
									ret := 0.985075 // buy
							if( lowerBand > 0.749955 )
								ret := 0.500000
						if( Color_con2 > -1.10519 )
							if( Color_con2 <= 1.39916 )
								if( upperBand <= 19.8218 )
									ret := -0.277174
								if( upperBand > 19.8218 )
									ret := 0.928571 // buy
							if( Color_con2 > 1.39916 )
								if( sDev <= 11.0084 )
									ret := 0.221192
								if( sDev > 11.0084 )
									ret := 0.733333 // buy
					if( lowerBand > 0.888785 )
						if( sDev <= 6.85857 )
							if( Color_con1 <= 1.17494 )
								if( Color_con2 <= 5.10276 )
									ret := 0.086667
								if( Color_con2 > 5.10276 )
									ret := -1.000000 // sell
							if( Color_con1 > 1.17494 )
								if( Color_con1 <= 2.26047 )
									ret := 0.823529 // buy
								if( Color_con1 > 2.26047 )
									ret := 0.285714
						if( sDev > 6.85857 )
							if( sDev <= 9.69888 )
								if( midLine <= 9.36122 )
									ret := -0.816327 // sell
								if( midLine > 9.36122 )
									ret := 0.076923
							if( sDev > 9.69888 )
								ret := 1.000000 // buy
				if( upperBand > 22.9254 )
					if( Color_con1 <= -10.1632 )
						if( Color_con2 <= -0.090783 )
							if( lowerBand <= 0.919937 )
								if( Color_con1 <= -11.1715 )
									ret := -1.000000 // sell
								if( Color_con1 > -11.1715 )
									ret := -0.750000 // sell
							if( lowerBand > 0.919937 )
								if( lowerBand <= 1.34039 )
									ret := 0.750000 // buy
								if( lowerBand > 1.34039 )
									ret := -0.571429
						if( Color_con2 > -0.090783 )
							if( upperBand <= 25.2876 )
								ret := 0.750000 // buy
							if( upperBand > 25.2876 )
								ret := -0.250000
					if( Color_con1 > -10.1632 )
						if( sDev <= 13.3747 )
							ret := -1.000000 // sell
						if( sDev > 13.3747 )
							ret := -0.750000 // sell
			if( lowerBand > 2.3467 )
				if( wvf <= 14.6425 )
					if( lowerBand <= 5.72763 )
						if( lowerBand <= 3.80008 )
							if( sDev <= 9.77524 )
								if( Color_con1 <= -5.87343 )
									ret := 0.895522 // buy
								if( Color_con1 > -5.87343 )
									ret := 0.474227
							if( sDev > 9.77524 )
								if( lowerBand <= 2.76018 )
									ret := -0.750000 // sell
								if( lowerBand > 2.76018 )
									ret := -1.000000 // sell
						if( lowerBand > 3.80008 )
							if( upperBand <= 18.7922 )
								if( upperBand <= 15.8116 )
									ret := 0.248780
								if( upperBand > 15.8116 )
									ret := -0.735849 // sell
							if( upperBand > 18.7922 )
								if( upperBand <= 22.79 )
									ret := 0.642857
								if( upperBand > 22.79 )
									ret := 1.000000 // buy
					if( lowerBand > 5.72763 )
						if( midLine <= 17.5333 )
							if( upperBand <= 19.7438 )
								if( sDev <= 4.97426 )
									ret := 0.846154 // buy
								if( sDev > 4.97426 )
									ret := 0.062500
							if( upperBand > 19.7438 )
								if( Color_con2 <= -5.55301 )
									ret := 0.833333 // buy
								if( Color_con2 > -5.55301 )
									ret := 0.986111 // buy
						if( midLine > 17.5333 )
							if( midLine <= 18.7251 )
								if( sDev <= 7.72388 )
									ret := -1.000000 // sell
								if( sDev > 7.72388 )
									ret := -0.500000
							if( midLine > 18.7251 )
								if( upperBand <= 29.1245 )
									ret := 0.812500 // buy
								if( upperBand > 29.1245 )
									ret := -0.833333 // sell
				if( wvf > 14.6425 )
					if( Color_con1 <= 1.61697 )
						if( Color_con2 <= 2.96887 )
							if( midLine <= 12.8341 )
								ret := 0.800000 // buy
							if( midLine > 12.8341 )
								if( wvf <= 14.8476 )
									ret := -0.250000
								if( wvf > 14.8476 )
									ret := -0.818182 // sell
						if( Color_con2 > 2.96887 )
							if( wvf <= 15.2741 )
								ret := -0.500000
							if( wvf > 15.2741 )
								ret := -1.000000 // sell
					if( Color_con1 > 1.61697 )
						ret := 1.000000 // buy
		if( wvf > 16.0334 )
			if( Color_con1 <= -2.70194 )
				if( Color_con2 <= 0.712227 )
					if( lowerBand <= -3.48128 )
						ret := -0.200000
					if( lowerBand > -3.48128 )
						if( wvf <= 17.8915 )
							if( Color_con1 <= -9.15817 )
								ret := 1.000000 // buy
							if( Color_con1 > -9.15817 )
								ret := -0.750000 // sell
						if( wvf > 17.8915 )
							ret := 1.000000 // buy
				if( Color_con2 > 0.712227 )
					if( wvf <= 22.9453 )
						if( midLine <= 10.7458 )
							if( upperBand <= 21.924 )
								if( wvf <= 17.3967 )
									ret := 1.000000 // buy
								if( wvf > 17.3967 )
									ret := -1.000000 // sell
							if( upperBand > 21.924 )
								if( upperBand <= 23.5298 )
									ret := 1.000000 // buy
								if( upperBand > 23.5298 )
									ret := 0.250000
						if( midLine > 10.7458 )
							if( sDev <= 11.542 )
								if( lowerBand <= 7.41572 )
									ret := 0.708333 // buy
								if( lowerBand > 7.41572 )
									ret := -0.900000 // sell
							if( sDev > 11.542 )
								if( sDev <= 12.8776 )
									ret := -0.884615 // sell
								if( sDev > 12.8776 )
									ret := -0.368421
					if( wvf > 22.9453 )
						if( sDev <= 13.8439 )
							ret := 0.400000
						if( sDev > 13.8439 )
							ret := 1.000000 // buy
			if( Color_con1 > -2.70194 )
				if( wvf <= 16.5492 )
					if( midLine <= 5.53406 )
						ret := 0.250000
					if( midLine > 5.53406 )
						if( wvf <= 16.3515 )
							ret := 1.000000 // buy
						if( wvf > 16.3515 )
							ret := 0.750000 // buy
				if( wvf > 16.5492 )
					if( Color_con2 <= 7.43523 )
						ret := 1.000000 // buy
					if( Color_con2 > 7.43523 )
						if( Color_con2 <= 8.01771 )
							if( upperBand <= 18.0503 )
								ret := 1.000000 // buy
							if( upperBand > 18.0503 )
								ret := -0.250000
						if( Color_con2 > 8.01771 )
							if( midLine <= 8.82713 )
								if( upperBand <= 15.2201 )
									ret := 0.842105 // buy
								if( upperBand > 15.2201 )
									ret := 1.000000 // buy
							if( midLine > 8.82713 )
								if( midLine <= 9.27239 )
									ret := 0.333333
								if( midLine > 9.27239 )
									ret := 0.928571 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Williams_Vix_Fix 
//@version=5
//indicator "CM_Williams_Vix_Fix", overlay=false)

// Inputs
pd = input.int(22, title="LookBack Period Standard Deviation High")
bbl = input.int(20, title="Bollinger Band Length")
mult = input.float(2.0, minval=1, maxval=5, title="Bollinger Band Standard Deviation Up")
lb = input.int(50, title="Look Back Period Percentile High")
ph = input.float(0.85, title="Highest Percentile - 0.90=90%, 0.95=95%, 0.99=99%")
pl = input.float(1.01, title="Lowest Percentile - 1.10=90%, 1.05=95%, 1.01=99%")
hp = input.bool(false, title="Show High Range - Based on Percentile and LookBack Period?")
sd = input.bool(false, title="Show Standard Deviation Line?")

// Calculations
wvf = ((ta.highest(close, pd) - low) / ta.highest(close, pd)) * 100

sDev = mult * ta.stdev(wvf, bbl)
midLine = ta.sma(wvf, bbl)
lowerBand = midLine - sDev
upperBand = midLine + sDev

rangeHigh = ta.highest(wvf, lb) * ph
rangeLow = ta.lowest(wvf, lb) * pl


Color_con1 = wvf - upperBand
Color_con2 = wvf - rangeHigh
// Color condition
col = wvf >= upperBand or wvf >= rangeHigh ? color.lime : color.gray
colInt = wvf >= upperBand or wvf >= rangeHigh ? 1 : 0 //Bool to int

// Plots
plot(hp and na(rangeHigh) ? na : rangeHigh, title="Range High Percentile", color=color.orange, linewidth=4)
plot(hp and na(rangeLow) ? na : rangeLow, title="Range Low Percentile", color=color.orange, linewidth=4)
plot(wvf, title="Williams Vix Fix", color=col, style=plot.style_histogram, linewidth=4)
plot(sd and na(upperBand) ? na : upperBand, title="Upper Band", color=color.aqua, linewidth=3)

// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_ADAUSDT_30Min_e78019d1(rangeHigh, rangeLow, midLine, sDev, lowerBand, wvf, Color_con1, colInt, Color_con2, upperBand)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.


