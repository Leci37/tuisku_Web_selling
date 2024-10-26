//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: HUBS_15Min_1WIL_3ee965e7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_HUBS_15Min_1WIL_3ee965e7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_HUBS_15Min_3ee965e7(sDev, Color_con1, lowerBand, wvf, upperBand, midLine, Color_con2, rangeLow, colInt, rangeHigh)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Color_con1 <= 0.598825 )
		if( Color_con2 <= -7.68967 )
			if( midLine <= 3.73479 )
				if( sDev <= 1.72652 )
					if( Color_con1 <= -1.37365 )
						if( upperBand <= 2.73908 )
							if( Color_con1 <= -1.93783 )
								if( Color_con1 <= -2.30497 )
									ret := 0.750000 // buy
								if( Color_con1 > -2.30497 )
									ret := -0.333333
							if( Color_con1 > -1.93783 )
								if( lowerBand <= -0.097845 )
									ret := 0.750000 // buy
								if( lowerBand > -0.097845 )
									ret := 0.166667
						if( upperBand > 2.73908 )
							if( sDev <= 1.24118 )
								ret := -1.000000 // sell
							if( sDev > 1.24118 )
								if( Color_con1 <= -2.03947 )
									ret := -0.846154 // sell
								if( Color_con1 > -2.03947 )
									ret := 0.000000
					if( Color_con1 > -1.37365 )
						if( wvf <= 1.78497 )
							if( lowerBand <= -0.011504 )
								if( Color_con2 <= -8.68558 )
									ret := 0.777778 // buy
								if( Color_con2 > -8.68558 )
									ret := 0.272727
							if( lowerBand > -0.011504 )
								if( upperBand <= 1.48733 )
									ret := 0.250000
								if( upperBand > 1.48733 )
									ret := 0.000000
						if( wvf > 1.78497 )
							if( upperBand <= 3.18566 )
								ret := 1.000000 // buy
							if( upperBand > 3.18566 )
								ret := 0.500000
				if( sDev > 1.72652 )
					if( Color_con1 <= -1.10017 )
						if( midLine <= 1.94016 )
							if( lowerBand <= -0.989402 )
								if( Color_con2 <= -9.65099 )
									ret := -1.000000 // sell
								if( Color_con2 > -9.65099 )
									ret := -0.250000
							if( lowerBand > -0.989402 )
								if( Color_con1 <= -2.95321 )
									ret := 0.918367 // buy
								if( Color_con1 > -2.95321 )
									ret := 0.108108
						if( midLine > 1.94016 )
							if( midLine <= 2.41657 )
								if( sDev <= 3.68761 )
									ret := 0.967213 // buy
								if( sDev > 3.68761 )
									ret := 0.000000
							if( midLine > 2.41657 )
								if( Color_con2 <= -7.92043 )
									ret := 0.729508 // buy
								if( Color_con2 > -7.92043 )
									ret := 0.200000
					if( Color_con1 > -1.10017 )
						if( wvf <= 3.20353 )
							ret := 1.000000 // buy
						if( wvf > 3.20353 )
							ret := -1.000000 // sell
			if( midLine > 3.73479 )
				if( sDev <= 6.83594 )
					if( Color_con1 <= -9.6269 )
						if( Color_con2 <= -8.62985 )
							if( midLine <= 4.97827 )
								if( Color_con2 <= -9.54771 )
									ret := 0.000000
								if( Color_con2 > -9.54771 )
									ret := 1.000000 // buy
							if( midLine > 4.97827 )
								if( Color_con2 <= -9.54604 )
									ret := -0.923077 // sell
								if( Color_con2 > -9.54604 )
									ret := -0.452381
						if( Color_con2 > -8.62985 )
							if( lowerBand <= 0.951629 )
								if( lowerBand <= -2.20561 )
									ret := -0.500000
								if( lowerBand > -2.20561 )
									ret := 0.743590 // buy
							if( lowerBand > 0.951629 )
								if( wvf <= 0.953617 )
									ret := -1.000000 // sell
								if( wvf > 0.953617 )
									ret := 0.235294
					if( Color_con1 > -9.6269 )
						if( lowerBand <= 1.64565 )
							if( wvf <= 8.53405 )
								if( sDev <= 6.36911 )
									ret := -0.814286 // sell
								if( sDev > 6.36911 )
									ret := -0.125000
							if( wvf > 8.53405 )
								ret := 0.400000
						if( lowerBand > 1.64565 )
							ret := 0.500000
				if( sDev > 6.83594 )
					if( midLine <= 11.9458 )
						if( midLine <= 9.03263 )
							if( midLine <= 5.72034 )
								if( upperBand <= 11.662 )
									ret := 0.000000
								if( upperBand > 11.662 )
									ret := 0.925926 // buy
							if( midLine > 5.72034 )
								if( sDev <= 8.01881 )
									ret := -0.346154
								if( sDev > 8.01881 )
									ret := 0.142857
						if( midLine > 9.03263 )
							if( Color_con2 <= -13.4608 )
								ret := 0.333333
							if( Color_con2 > -13.4608 )
								if( upperBand <= 17.6142 )
									ret := 0.750000 // buy
								if( upperBand > 17.6142 )
									ret := 1.000000 // buy
					if( midLine > 11.9458 )
						if( midLine <= 14.0765 )
							ret := -1.000000 // sell
						if( midLine > 14.0765 )
							ret := -0.833333 // sell
		if( Color_con2 > -7.68967 )
			if( Color_con2 <= -3.85349 )
				if( lowerBand <= -0.977338 )
					if( wvf <= 1.43225 )
						if( upperBand <= 9.63581 )
							if( wvf <= 0.113919 )
								if( upperBand <= 6.91095 )
									ret := 0.833333 // buy
								if( upperBand > 6.91095 )
									ret := 0.333333
							if( wvf > 0.113919 )
								if( sDev <= 5.02377 )
									ret := 0.029463
								if( sDev > 5.02377 )
									ret := 0.706897 // buy
						if( upperBand > 9.63581 )
							if( midLine <= 4.87509 )
								if( sDev <= 6.03899 )
									ret := -0.941176 // sell
								if( sDev > 6.03899 )
									ret := -0.444444
							if( midLine > 4.87509 )
								ret := 0.142857
					if( wvf > 1.43225 )
						if( Color_con2 <= -7.1295 )
							if( midLine <= 4.94991 )
								if( upperBand <= 9.25757 )
									ret := -0.750000 // sell
								if( upperBand > 9.25757 )
									ret := 0.250000
							if( midLine > 4.94991 )
								ret := -1.000000 // sell
						if( Color_con2 > -7.1295 )
							if( Color_con1 <= -8.06757 )
								if( sDev <= 7.25291 )
									ret := 0.897196 // buy
								if( sDev > 7.25291 )
									ret := -0.333333
							if( Color_con1 > -8.06757 )
								if( lowerBand <= -1.42736 )
									ret := 0.616071
								if( lowerBand > -1.42736 )
									ret := 0.044444
				if( lowerBand > -0.977338 )
					if( upperBand <= 1.3493 )
						if( midLine <= 0.480025 )
							if( Color_con2 <= -4.3043 )
								if( upperBand <= 1.00349 )
									ret := -0.818182 // sell
								if( upperBand > 1.00349 )
									ret := -0.250000
							if( Color_con2 > -4.3043 )
								if( sDev <= 0.512303 )
									ret := 0.647059
								if( sDev > 0.512303 )
									ret := 0.000000
						if( midLine > 0.480025 )
							if( wvf <= 0.984961 )
								if( wvf <= 0.643776 )
									ret := -0.525773
								if( wvf > 0.643776 )
									ret := -0.769231 // sell
							if( wvf > 0.984961 )
								if( Color_con2 <= -5.64737 )
									ret := -0.800000 // sell
								if( Color_con2 > -5.64737 )
									ret := 0.250000
					if( upperBand > 1.3493 )
						if( upperBand <= 4.32318 )
							if( lowerBand <= 0.008583 )
								if( Color_con1 <= -1.16562 )
									ret := 0.017585
								if( Color_con1 > -1.16562 )
									ret := -0.380471
							if( lowerBand > 0.008583 )
								if( lowerBand <= 0.931516 )
									ret := 0.228972
								if( lowerBand > 0.931516 )
									ret := -0.213333
						if( upperBand > 4.32318 )
							if( upperBand <= 11.0474 )
								if( wvf <= 6.37733 )
									ret := -0.184284
								if( wvf > 6.37733 )
									ret := 0.909091 // buy
							if( upperBand > 11.0474 )
								if( upperBand <= 13.1417 )
									ret := 0.256267
								if( upperBand > 13.1417 )
									ret := -0.314516
			if( Color_con2 > -3.85349 )
				if( upperBand <= 17.8435 )
					if( Color_con2 <= -2.58689 )
						if( wvf <= 0.318419 )
							if( Color_con2 <= -3.3197 )
								if( midLine <= 1.4534 )
									ret := 0.317597
								if( midLine > 1.4534 )
									ret := 0.704918 // buy
							if( Color_con2 > -3.3197 )
								if( midLine <= 2.68292 )
									ret := 0.193548
								if( midLine > 2.68292 )
									ret := -0.750000 // sell
						if( wvf > 0.318419 )
							if( midLine <= 4.80892 )
								if( midLine <= 4.06131 )
									ret := 0.091847
								if( midLine > 4.06131 )
									ret := 0.398190
							if( midLine > 4.80892 )
								if( lowerBand <= 4.55151 )
									ret := -0.313433
								if( lowerBand > 4.55151 )
									ret := 0.551724
					if( Color_con2 > -2.58689 )
						if( Color_con1 <= -0.416726 )
							if( midLine <= 7.95067 )
								if( midLine <= 6.81114 )
									ret := 0.025815
								if( midLine > 6.81114 )
									ret := -0.234323
							if( midLine > 7.95067 )
								if( Color_con2 <= -2.12447 )
									ret := -0.388889
								if( Color_con2 > -2.12447 )
									ret := 0.492611
						if( Color_con1 > -0.416726 )
							if( sDev <= 2.75484 )
								if( lowerBand <= -1.18046 )
									ret := -0.467742
								if( lowerBand > -1.18046 )
									ret := 0.077202
							if( sDev > 2.75484 )
								if( Color_con2 <= 4.7603 )
									ret := 0.345483
								if( Color_con2 > 4.7603 )
									ret := 0.037975
				if( upperBand > 17.8435 )
					if( wvf <= 14.8515 )
						if( wvf <= 11.9504 )
							ret := 0.000000
						if( wvf > 11.9504 )
							if( Color_con1 <= -6.57004 )
								ret := -1.000000 // sell
							if( Color_con1 > -6.57004 )
								if( sDev <= 8.31712 )
									ret := -0.952381 // sell
								if( sDev > 8.31712 )
									ret := -0.583333
					if( wvf > 14.8515 )
						if( Color_con2 <= 4.00436 )
							if( wvf <= 17.3872 )
								ret := 0.750000 // buy
							if( wvf > 17.3872 )
								ret := -0.250000
						if( Color_con2 > 4.00436 )
							ret := 1.000000 // buy
	if( Color_con1 > 0.598825 )
		if( upperBand <= 4.30161 )
			if( Color_con2 <= 0.795845 )
				if( Color_con2 <= -0.532432 )
					if( lowerBand <= -0.6195 )
						if( midLine <= 0.855333 )
							ret := 0.750000 // buy
						if( midLine > 0.855333 )
							ret := 1.000000 // buy
					if( lowerBand > -0.6195 )
						if( midLine <= 0.474636 )
							ret := 0.666667
						if( midLine > 0.474636 )
							if( midLine <= 0.547395 )
								ret := -1.000000 // sell
							if( midLine > 0.547395 )
								if( wvf <= 3.55739 )
									ret := 0.103448
								if( wvf > 3.55739 )
									ret := -0.666667
				if( Color_con2 > -0.532432 )
					if( sDev <= 1.48151 )
						if( Color_con1 <= 0.750052 )
							if( Color_con1 <= 0.684578 )
								ret := 1.000000 // buy
							if( Color_con1 > 0.684578 )
								if( Color_con1 <= 0.706261 )
									ret := 0.500000
								if( Color_con1 > 0.706261 )
									ret := 1.000000 // buy
						if( Color_con1 > 0.750052 )
							if( Color_con1 <= 0.891585 )
								if( Color_con2 <= 0.16437 )
									ret := 0.000000
								if( Color_con2 > 0.16437 )
									ret := 0.500000
							if( Color_con1 > 0.891585 )
								if( wvf <= 2.65774 )
									ret := 0.500000
								if( wvf > 2.65774 )
									ret := 1.000000 // buy
					if( sDev > 1.48151 )
						if( Color_con1 <= 0.7176 )
							if( Color_con2 <= -0.058814 )
								ret := 0.250000
							if( Color_con2 > -0.058814 )
								if( upperBand <= 2.92203 )
									ret := 0.750000 // buy
								if( upperBand > 2.92203 )
									ret := 1.000000 // buy
						if( Color_con1 > 0.7176 )
							if( upperBand <= 2.5045 )
								ret := -0.666667
							if( upperBand > 2.5045 )
								if( wvf <= 3.80925 )
									ret := 1.000000 // buy
								if( wvf > 3.80925 )
									ret := 0.000000
			if( Color_con2 > 0.795845 )
				if( sDev <= 1.6342 )
					if( lowerBand <= -0.289486 )
						if( lowerBand <= -0.334885 )
							if( Color_con2 <= 2.08949 )
								if( Color_con2 <= 1.83224 )
									ret := -0.130000
								if( Color_con2 > 1.83224 )
									ret := 0.440000
							if( Color_con2 > 2.08949 )
								if( lowerBand <= -0.873482 )
									ret := -1.000000 // sell
								if( lowerBand > -0.873482 )
									ret := -0.333333
						if( lowerBand > -0.334885 )
							if( Color_con1 <= 0.895212 )
								ret := 1.000000 // buy
							if( Color_con1 > 0.895212 )
								ret := 0.166667
					if( lowerBand > -0.289486 )
						if( lowerBand <= 0.528979 )
							if( Color_con2 <= 2.36806 )
								if( Color_con2 <= 2.2206 )
									ret := -0.602941
								if( Color_con2 > 2.2206 )
									ret := -1.000000 // sell
							if( Color_con2 > 2.36806 )
								ret := 0.500000
						if( lowerBand > 0.528979 )
							if( midLine <= 2.05724 )
								ret := 1.000000 // buy
							if( midLine > 2.05724 )
								if( upperBand <= 3.65821 )
									ret := -1.000000 // sell
								if( upperBand > 3.65821 )
									ret := 0.100000
				if( sDev > 1.6342 )
					if( Color_con1 <= 1.17584 )
						if( midLine <= 0.892855 )
							if( upperBand <= 2.48214 )
								ret := -0.250000
							if( upperBand > 2.48214 )
								if( wvf <= 3.40318 )
									ret := -1.000000 // sell
								if( wvf > 3.40318 )
									ret := -0.545455
						if( midLine > 0.892855 )
							if( Color_con2 <= 2.05088 )
								if( sDev <= 2.17829 )
									ret := 0.363636
								if( sDev > 2.17829 )
									ret := 1.000000 // buy
							if( Color_con2 > 2.05088 )
								if( lowerBand <= -1.57283 )
									ret := 0.600000
								if( lowerBand > -1.57283 )
									ret := -0.272727
					if( Color_con1 > 1.17584 )
						if( wvf <= 5.02865 )
							if( upperBand <= 2.96889 )
								if( sDev <= 1.99323 )
									ret := 0.575758
								if( sDev > 1.99323 )
									ret := -0.166667
							if( upperBand > 2.96889 )
								if( Color_con2 <= 3.18499 )
									ret := 0.952381 // buy
								if( Color_con2 > 3.18499 )
									ret := 0.000000
						if( wvf > 5.02865 )
							if( midLine <= 1.37647 )
								if( midLine <= 1.09617 )
									ret := -0.222222
								if( midLine > 1.09617 )
									ret := 0.740741 // buy
							if( midLine > 1.37647 )
								if( wvf <= 5.38129 )
									ret := -0.526316
								if( wvf > 5.38129 )
									ret := 0.166667
		if( upperBand > 4.30161 )
			if( wvf <= 7.43941 )
				if( midLine <= 2.19055 )
					if( Color_con1 <= 2.47999 )
						if( Color_con2 <= 3.45201 )
							if( Color_con2 <= 0.017324 )
								ret := 0.142857
							if( Color_con2 > 0.017324 )
								if( midLine <= 1.75152 )
									ret := 0.625000
								if( midLine > 1.75152 )
									ret := 0.940299 // buy
						if( Color_con2 > 3.45201 )
							if( midLine <= 1.73055 )
								if( wvf <= 5.49671 )
									ret := 0.250000
								if( wvf > 5.49671 )
									ret := 0.880952 // buy
							if( midLine > 1.73055 )
								if( wvf <= 6.60476 )
									ret := -0.600000
								if( wvf > 6.60476 )
									ret := 0.750000 // buy
					if( Color_con1 > 2.47999 )
						ret := -1.000000 // sell
				if( midLine > 2.19055 )
					if( upperBand <= 5.13587 )
						if( wvf <= 5.71974 )
							if( Color_con2 <= 2.24075 )
								ret := 1.000000 // buy
							if( Color_con2 > 2.24075 )
								ret := -0.200000
						if( wvf > 5.71974 )
							if( wvf <= 6.0808 )
								if( wvf <= 5.86218 )
									ret := -0.750000 // sell
								if( wvf > 5.86218 )
									ret := -1.000000 // sell
							if( wvf > 6.0808 )
								ret := 0.142857
					if( upperBand > 5.13587 )
						if( Color_con2 <= 3.37068 )
							if( upperBand <= 5.63218 )
								if( wvf <= 6.42234 )
									ret := 0.272727
								if( wvf > 6.42234 )
									ret := 0.909091 // buy
							if( upperBand > 5.63218 )
								if( midLine <= 3.59755 )
									ret := 1.000000 // buy
								if( midLine > 3.59755 )
									ret := 0.428571
						if( Color_con2 > 3.37068 )
							if( wvf <= 7.31484 )
								if( midLine <= 2.61075 )
									ret := 0.666667
								if( midLine > 2.61075 )
									ret := -0.583333
							if( wvf > 7.31484 )
								ret := 1.000000 // buy
			if( wvf > 7.43941 )
				if( Color_con1 <= 3.94837 )
					if( Color_con1 <= 3.30863 )
						if( midLine <= 5.2234 )
							if( midLine <= 3.92139 )
								if( midLine <= 3.59944 )
									ret := 0.125000
								if( midLine > 3.59944 )
									ret := 0.875000 // buy
							if( midLine > 3.92139 )
								if( lowerBand <= 0.560379 )
									ret := -0.400000
								if( lowerBand > 0.560379 )
									ret := -0.875000 // sell
						if( midLine > 5.2234 )
							if( upperBand <= 11.0738 )
								if( wvf <= 10.5765 )
									ret := 0.800000 // buy
								if( wvf > 10.5765 )
									ret := 1.000000 // buy
							if( upperBand > 11.0738 )
								if( upperBand <= 14.7384 )
									ret := -0.400000
								if( upperBand > 14.7384 )
									ret := 0.833333 // buy
					if( Color_con1 > 3.30863 )
						if( lowerBand <= -2.18805 )
							ret := 0.400000
						if( lowerBand > -2.18805 )
							if( sDev <= 3.50676 )
								ret := -1.000000 // sell
							if( sDev > 3.50676 )
								ret := -0.500000
				if( Color_con1 > 3.94837 )
					ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_HUBS_15Min_3ee965e7(sDev, Color_con1, lowerBand, wvf, upperBand, midLine, Color_con2, rangeLow, colInt, rangeHigh)

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


