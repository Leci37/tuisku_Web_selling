//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Chaikin_Money_Flow
// ID_model: SNAP_1Min_2BC0_6c525152 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNAP_1Min_2BC0_6c525152", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNAP_1Min_6c525152(bbm, bearPower, bbp, bullPower, BBPower_Color, mf, ad, ad_mf)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bbp <= 0.016744 )
		if( ad <= 198.165 )
			if( ad_mf <= -5771.2 )
				if( mf <= 0.008357 )
					if( bullPower <= -0.101705 )
						if( bbp <= -0.706946 )
							ret := 1.000000 // buy
						if( bbp > -0.706946 )
							if( ad <= -12316 )
								if( bbm <= 0.050886 )
									ret := 0.000000
								if( bbm > 0.050886 )
									ret := 0.608696
							if( ad > -12316 )
								ret := 1.000000 // buy
					if( bullPower > -0.101705 )
						if( bbp <= -0.010276 )
							if( ad <= -732724 )
								if( bbm <= 0.24905 )
									ret := 0.861111 // buy
								if( bbm > 0.24905 )
									ret := 0.333333
							if( ad > -732724 )
								if( ad_mf <= -583861 )
									ret := -0.961538 // sell
								if( ad_mf > -583861 )
									ret := 0.039007
						if( bbp > -0.010276 )
							if( BBPower_Color <= 0.5 )
								if( ad_mf <= -52504.8 )
									ret := 0.313373
								if( ad_mf > -52504.8 )
									ret := 0.157314
							if( BBPower_Color > 0.5 )
								if( bbp <= 0.000407 )
									ret := 0.264151
								if( bbp > 0.000407 )
									ret := 0.034252
				if( mf > 0.008357 )
					if( ad_mf <= -74879.1 )
						if( ad <= -77290.6 )
							if( bbm <= 0.07988 )
								if( bbp <= 0.00031 )
									ret := 0.430147
								if( bbp > 0.00031 )
									ret := -0.081481
							if( bbm > 0.07988 )
								if( ad_mf <= -148843 )
									ret := -1.000000 // sell
								if( ad_mf > -148843 )
									ret := -0.481481
						if( ad > -77290.6 )
							if( mf <= 0.115174 )
								if( bullPower <= 0.014037 )
									ret := 0.375000
								if( bullPower > 0.014037 )
									ret := 0.888889 // buy
							if( mf > 0.115174 )
								ret := 1.000000 // buy
					if( ad_mf > -74879.1 )
						if( bearPower <= -0.024804 )
							if( bbm <= 0.011679 )
								if( bearPower <= -0.029277 )
									ret := 0.550000
								if( bearPower > -0.029277 )
									ret := 0.277778
							if( bbm > 0.011679 )
								if( ad <= -45985.5 )
									ret := 0.013245
								if( ad > -45985.5 )
									ret := -0.240476
						if( bearPower > -0.024804 )
							if( bearPower <= -0.003736 )
								if( bbp <= 0.0125 )
									ret := 0.012784
								if( bbp > 0.0125 )
									ret := -0.110390
							if( bearPower > -0.003736 )
								if( ad_mf <= -15718 )
									ret := 0.354839
								if( ad_mf > -15718 )
									ret := 0.104019
			if( ad_mf > -5771.2 )
				if( bullPower <= -0.005023 )
					if( ad <= -5052.3 )
						if( bearPower <= -0.021579 )
							if( ad <= -5450.33 )
								if( bbm <= 0.014725 )
									ret := 0.925926 // buy
								if( bbm > 0.014725 )
									ret := 0.025641
							if( ad > -5450.33 )
								if( bullPower <= -0.016011 )
									ret := -0.258065
								if( bullPower > -0.016011 )
									ret := -0.714286 // sell
						if( bearPower > -0.021579 )
							if( bullPower <= -0.007006 )
								if( mf <= -0.060665 )
									ret := -0.937500 // sell
								if( mf > -0.060665 )
									ret := -0.272727
							if( bullPower > -0.007006 )
								ret := 0.000000
					if( ad > -5052.3 )
						if( bbm <= 1.6e-05 )
							if( bullPower <= -0.042091 )
								if( bullPower <= -0.086566 )
									ret := 0.888889 // buy
								if( bullPower > -0.086566 )
									ret := 0.663934
							if( bullPower > -0.042091 )
								if( mf <= 0.262681 )
									ret := 0.380117
								if( mf > 0.262681 )
									ret := 0.172043
						if( bbm > 1.6e-05 )
							if( bbp <= -0.045832 )
								if( ad_mf <= -175.08 )
									ret := 0.355263
								if( ad_mf > -175.08 )
									ret := 0.042026
							if( bbp > -0.045832 )
								if( mf <= -0.16124 )
									ret := 0.185621
								if( mf > -0.16124 )
									ret := -0.000664
				if( bullPower > -0.005023 )
					if( ad <= -245.879 )
						if( bearPower <= -0.020111 )
							if( mf <= -0.296217 )
								if( bbp <= -0.022814 )
									ret := -0.236842
								if( bbp > -0.022814 )
									ret := 0.500000
							if( mf > -0.296217 )
								if( bullPower <= -0.001817 )
									ret := 0.040000
								if( bullPower > -0.001817 )
									ret := 0.557416
						if( bearPower > -0.020111 )
							if( mf <= 0.000186 )
								if( bullPower <= 0.005581 )
									ret := 0.012594
								if( bullPower > 0.005581 )
									ret := 0.228814
							if( mf > 0.000186 )
								if( ad <= -549.143 )
									ret := 0.120192
								if( ad > -549.143 )
									ret := 0.544444
					if( ad > -245.879 )
						if( ad_mf <= -0.218552 )
							if( ad <= -188.837 )
								if( bbp <= -0.014822 )
									ret := 0.312500
								if( bbp > -0.014822 )
									ret := -0.402174
							if( ad > -188.837 )
								if( bearPower <= -0.000717 )
									ret := 0.048679
								if( bearPower > -0.000717 )
									ret := -0.117942
						if( ad_mf > -0.218552 )
							if( mf <= 0.184358 )
								if( BBPower_Color <= 0.5 )
									ret := 0.084685
								if( BBPower_Color > 0.5 )
									ret := -0.000799
							if( mf > 0.184358 )
								if( bbp <= -0.014319 )
									ret := 0.642857
								if( bbp > -0.014319 )
									ret := 0.292490
		if( ad > 198.165 )
			if( bbp <= -0.225463 )
				if( ad <= 28718.4 )
					if( ad_mf <= 9075.99 )
						ret := 0.666667
					if( ad_mf > 9075.99 )
						if( bearPower <= -0.246305 )
							ret := -0.944444 // sell
						if( bearPower > -0.246305 )
							if( bullPower <= -0.102403 )
								ret := 0.700000 // buy
							if( bullPower > -0.102403 )
								ret := 0.250000
				if( ad > 28718.4 )
					if( bbm <= 0.053834 )
						if( mf <= -0.18023 )
							ret := -0.066667
						if( mf > -0.18023 )
							ret := 0.200000
					if( bbm > 0.053834 )
						if( bullPower <= -0.104875 )
							if( bearPower <= -0.304154 )
								if( bullPower <= -0.348116 )
									ret := 1.000000 // buy
								if( bullPower > -0.348116 )
									ret := 0.888889 // buy
							if( bearPower > -0.304154 )
								ret := 1.000000 // buy
						if( bullPower > -0.104875 )
							if( ad_mf <= 131035 )
								if( ad <= 57802.9 )
									ret := 0.625000
								if( ad > 57802.9 )
									ret := 0.916667 // buy
							if( ad_mf > 131035 )
								if( bbp <= -0.270256 )
									ret := -0.333333
								if( bbp > -0.270256 )
									ret := 0.312500
			if( bbp > -0.225463 )
				if( ad_mf <= 1.0503e+06 )
					if( bullPower <= 0.017005 )
						if( bbm <= 0.106765 )
							if( bbm <= 0.035036 )
								if( bullPower <= -0.005682 )
									ret := -0.110397
								if( bullPower > -0.005682 )
									ret := -0.034043
							if( bbm > 0.035036 )
								if( bbm <= 0.035251 )
									ret := 0.760000 // buy
								if( bbm > 0.035251 )
									ret := 0.037391
						if( bbm > 0.106765 )
							if( bearPower <= -0.185776 )
								ret := 0.500000
							if( bearPower > -0.185776 )
								if( ad_mf <= 56077.7 )
									ret := -0.775000 // sell
								if( ad_mf > 56077.7 )
									ret := -0.451613
					if( bullPower > 0.017005 )
						if( ad_mf <= 4800.32 )
							if( bbp <= -0.009036 )
								if( bearPower <= -0.051176 )
									ret := -0.263158
								if( bearPower > -0.051176 )
									ret := 0.590909
							if( bbp > -0.009036 )
								if( ad_mf <= 832.512 )
									ret := -0.090909
								if( ad_mf > 832.512 )
									ret := -0.670000
						if( ad_mf > 4800.32 )
							if( ad_mf <= 66571.8 )
								if( bbm <= 0.051948 )
									ret := -0.060805
								if( bbm > 0.051948 )
									ret := -0.334311
							if( ad_mf > 66571.8 )
								if( mf <= -0.071929 )
									ret := -0.240000
								if( mf > -0.071929 )
									ret := 0.111111
				if( ad_mf > 1.0503e+06 )
					if( bullPower <= 0.014717 )
						ret := -0.466667
					if( bullPower > 0.014717 )
						ret := -1.000000 // sell
	if( bbp > 0.016744 )
		if( ad <= -39.6302 )
			if( BBPower_Color <= 0.5 )
				if( bbp <= 0.026527 )
					if( ad <= -42561.2 )
						if( bearPower <= -0.005666 )
							if( ad_mf <= -69985.1 )
								if( ad <= -103068 )
									ret := 0.190476
								if( ad > -103068 )
									ret := -0.900000 // sell
							if( ad_mf > -69985.1 )
								if( mf <= 0.034092 )
									ret := 0.125000
								if( mf > 0.034092 )
									ret := 0.625000
						if( bearPower > -0.005666 )
							if( bbp <= 0.02117 )
								if( ad_mf <= -82202.3 )
									ret := 0.176471
								if( ad_mf > -82202.3 )
									ret := -0.500000
							if( bbp > 0.02117 )
								if( mf <= -0.073658 )
									ret := -0.909091 // sell
								if( mf > -0.073658 )
									ret := -0.529412
					if( ad > -42561.2 )
						if( bullPower <= 0.019461 )
							if( bbm <= 0.009993 )
								if( ad_mf <= -5104.83 )
									ret := 0.250000
								if( ad_mf > -5104.83 )
									ret := -0.714286 // sell
							if( bbm > 0.009993 )
								if( bbm <= 0.011385 )
									ret := 0.545455
								if( bbm > 0.011385 )
									ret := 0.012346
						if( bullPower > 0.019461 )
							if( ad_mf <= -1231 )
								if( bbm <= 0.054067 )
									ret := 0.353383
								if( bbm > 0.054067 )
									ret := 0.764706 // buy
							if( ad_mf > -1231 )
								if( bullPower <= 0.029047 )
									ret := 0.692308
								if( bullPower > 0.029047 )
									ret := 1.000000 // buy
				if( bbp > 0.026527 )
					if( ad <= -640634 )
						ret := 0.909091 // buy
					if( ad > -640634 )
						if( ad <= -183487 )
							if( bbm <= 0.085464 )
								if( ad_mf <= -295615 )
									ret := -0.500000
								if( ad_mf > -295615 )
									ret := -1.000000 // sell
							if( bbm > 0.085464 )
								if( mf <= -0.016419 )
									ret := -0.909091 // sell
								if( mf > -0.016419 )
									ret := 0.571429
						if( ad > -183487 )
							if( ad <= -300.159 )
								if( bearPower <= 0.014315 )
									ret := 0.055151
								if( bearPower > 0.014315 )
									ret := -0.091589
							if( ad > -300.159 )
								if( ad <= -195.528 )
									ret := 1.000000 // buy
								if( ad > -195.528 )
									ret := 0.500000
			if( BBPower_Color > 0.5 )
				if( ad <= -71023.9 )
					if( ad <= -73273.3 )
						if( bbp <= 0.14691 )
							if( bullPower <= 0.059548 )
								if( ad <= -73772.5 )
									ret := -0.133929
								if( ad > -73772.5 )
									ret := 0.769231 // buy
							if( bullPower > 0.059548 )
								if( ad_mf <= -84045.8 )
									ret := 0.238095
								if( ad_mf > -84045.8 )
									ret := -0.357143
						if( bbp > 0.14691 )
							if( bbm <= 0.106285 )
								if( bearPower <= 0.064918 )
									ret := -0.590164
								if( bearPower > 0.064918 )
									ret := -0.805556 // sell
							if( bbm > 0.106285 )
								if( bbm <= 0.136232 )
									ret := 0.692308
								if( bbm > 0.136232 )
									ret := -0.285714
					if( ad > -73273.3 )
						if( ad <= -71977 )
							if( bearPower <= 0.01512 )
								ret := -0.437500
							if( bearPower > 0.01512 )
								ret := -1.000000 // sell
						if( ad > -71977 )
							if( ad_mf <= -71830.3 )
								ret := -1.000000 // sell
							if( ad_mf > -71830.3 )
								if( bbp <= 0.059538 )
									ret := -0.666667
								if( bbp > 0.059538 )
									ret := -0.764706 // sell
				if( ad > -71023.9 )
					if( ad <= -68133.6 )
						if( ad <= -69563.5 )
							if( ad_mf <= -70335.7 )
								if( ad <= -70473.9 )
									ret := 0.153846
								if( ad > -70473.9 )
									ret := 1.000000 // buy
							if( ad_mf > -70335.7 )
								ret := -0.352941
						if( ad > -69563.5 )
							if( ad_mf <= -69270.8 )
								ret := 0.947368 // buy
							if( ad_mf > -69270.8 )
								ret := 0.470588
					if( ad > -68133.6 )
						if( bearPower <= 0.01075 )
							if( mf <= -0.249569 )
								if( ad_mf <= -1324.37 )
									ret := 0.253165
								if( ad_mf > -1324.37 )
									ret := 0.880952 // buy
							if( mf > -0.249569 )
								if( ad_mf <= -67836.6 )
									ret := -1.000000 // sell
								if( ad_mf > -67836.6 )
									ret := 0.049528
						if( bearPower > 0.01075 )
							if( bearPower <= 0.159106 )
								if( mf <= 0.30884 )
									ret := -0.100000
								if( mf > 0.30884 )
									ret := 0.210983
							if( bearPower > 0.159106 )
								ret := -1.000000 // sell
		if( ad > -39.6302 )
			if( bearPower <= -0.016488 )
				if( bearPower <= -0.141683 )
					ret := 0.846154 // buy
				if( bearPower > -0.141683 )
					if( mf <= -0.011973 )
						if( bbp <= 0.026319 )
							if( bearPower <= -0.024127 )
								ret := 0.071429
							if( bearPower > -0.024127 )
								if( BBPower_Color <= 0.5 )
									ret := -0.444444
								if( BBPower_Color > 0.5 )
									ret := 0.000000
						if( bbp > 0.026319 )
							if( bearPower <= -0.030709 )
								if( bearPower <= -0.062449 )
									ret := -1.000000 // sell
								if( bearPower > -0.062449 )
									ret := 0.052632
							if( bearPower > -0.030709 )
								if( bbp <= 0.046379 )
									ret := -0.666667
								if( bbp > 0.046379 )
									ret := -1.000000 // sell
					if( mf > -0.011973 )
						if( ad <= 34473.8 )
							if( bearPower <= -0.020491 )
								if( bullPower <= 0.086013 )
									ret := -0.806452 // sell
								if( bullPower > 0.086013 )
									ret := -1.000000 // sell
							if( bearPower > -0.020491 )
								if( ad_mf <= 10756.1 )
									ret := -0.823529 // sell
								if( ad_mf > 10756.1 )
									ret := -0.125000
						if( ad > 34473.8 )
							if( bbm <= 0.059881 )
								ret := 0.090909
							if( bbm > 0.059881 )
								if( ad_mf <= 90642.5 )
									ret := -0.060606
								if( ad_mf > 90642.5 )
									ret := -0.555556
			if( bearPower > -0.016488 )
				if( bullPower <= 0.076358 )
					if( bearPower <= 0.018971 )
						if( bbp <= 0.029363 )
							if( bbm <= 0.004054 )
								if( ad_mf <= 0.341165 )
									ret := -0.249467
								if( ad_mf > 0.341165 )
									ret := -0.024561
							if( bbm > 0.004054 )
								if( bearPower <= 0.006128 )
									ret := -0.141694
								if( bearPower > 0.006128 )
									ret := 0.018141
						if( bbp > 0.029363 )
							if( bullPower <= 0.055836 )
								if( bbm <= 0.000538 )
									ret := -0.173184
								if( bbm > 0.000538 )
									ret := -0.060206
							if( bullPower > 0.055836 )
								if( bearPower <= 0.002299 )
									ret := -0.455752
								if( bearPower > 0.002299 )
									ret := -0.076316
					if( bearPower > 0.018971 )
						if( bbm <= 0.000729 )
							if( bbp <= 0.10451 )
								if( mf <= 0.343925 )
									ret := -0.435580
								if( mf > 0.343925 )
									ret := -0.117479
							if( bbp > 0.10451 )
								if( bearPower <= 0.057044 )
									ret := -0.800000 // sell
								if( bearPower > 0.057044 )
									ret := -0.432258
						if( bbm > 0.000729 )
							if( bearPower <= 0.042083 )
								if( ad_mf <= -0.024222 )
									ret := 0.127042
								if( ad_mf > -0.024222 )
									ret := -0.126649
							if( bearPower > 0.042083 )
								if( bullPower <= 0.052626 )
									ret := -0.807692 // sell
								if( bullPower > 0.052626 )
									ret := -0.283708
				if( bullPower > 0.076358 )
					if( ad_mf <= 44109.6 )
						if( bbp <= 0.208945 )
							if( bearPower <= -0.003603 )
								if( bbp <= 0.083531 )
									ret := 0.555556
								if( bbp > 0.083531 )
									ret := 0.142857
							if( bearPower > -0.003603 )
								if( bbp <= 0.201866 )
									ret := -0.440341
								if( bbp > 0.201866 )
									ret := 0.312500
						if( bbp > 0.208945 )
							if( ad_mf <= 21124.3 )
								if( bearPower <= 0.130108 )
									ret := -0.733333 // sell
								if( bearPower > 0.130108 )
									ret := -0.976744 // sell
							if( ad_mf > 21124.3 )
								if( bullPower <= 0.182577 )
									ret := -0.571429
								if( bullPower > 0.182577 )
									ret := 0.000000
					if( ad_mf > 44109.6 )
						if( bbm <= 0.070999 )
							if( bullPower <= 0.087573 )
								if( ad <= 75188.5 )
									ret := 0.338710
								if( ad > 75188.5 )
									ret := 0.013333
							if( bullPower > 0.087573 )
								if( ad_mf <= 138045 )
									ret := 0.097902
								if( ad_mf > 138045 )
									ret := -0.683333
						if( bbm > 0.070999 )
							if( bbp <= 1.74733 )
								if( ad <= 101431 )
									ret := 0.009524
								if( ad > 101431 )
									ret := -0.548936
							if( bbp > 1.74733 )
								ret := 0.777778 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf
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
float op_operation = decision_tree_0_SNAP_1Min_6c525152(bbm, bearPower, bbp, bullPower, BBPower_Color, mf, ad, ad_mf)

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


