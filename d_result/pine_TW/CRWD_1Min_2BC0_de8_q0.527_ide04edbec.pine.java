//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Chaikin_Money_Flow
// ID_model: CRWD_1Min_2BC0_e04edbec Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_1Min_2BC0_e04edbec", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_1Min_e04edbec(bearPower, bbm, bbp, bullPower, BBPower_Color, mf, ad_mf, ad)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bbp <= -0.510006 )
		if( ad_mf <= 0.947775 )
			if( ad <= -579.001 )
				if( mf <= -0.474318 )
					if( ad_mf <= -19419.2 )
						if( bbp <= -2.68121 )
							if( ad_mf <= -270680 )
								ret := 1.000000 // buy
							if( ad_mf > -270680 )
								if( ad_mf <= -39084.4 )
									ret := -0.333333
								if( ad_mf > -39084.4 )
									ret := 0.933333 // buy
						if( bbp > -2.68121 )
							if( bbp <= -1.04826 )
								if( bbp <= -1.65046 )
									ret := 0.952381 // buy
								if( bbp > -1.65046 )
									ret := 0.529412
							if( bbp > -1.04826 )
								ret := 1.000000 // buy
					if( ad_mf > -19419.2 )
						if( bullPower <= 0.086318 )
							if( mf <= -0.653263 )
								if( bearPower <= -0.72774 )
									ret := -0.352941
								if( bearPower > -0.72774 )
									ret := 0.250000
							if( mf > -0.653263 )
								if( ad <= -2861.61 )
									ret := 0.070000
								if( ad > -2861.61 )
									ret := 0.506849
						if( bullPower > 0.086318 )
							ret := -1.000000 // sell
				if( mf > -0.474318 )
					if( bbp <= -20.059 )
						ret := -0.937500 // sell
					if( bbp > -20.059 )
						if( ad <= -1704.68 )
							if( ad_mf <= -3122.54 )
								if( ad <= -4528.71 )
									ret := 0.097135
								if( ad > -4528.71 )
									ret := -0.086600
							if( ad_mf > -3122.54 )
								if( mf <= 0.116602 )
									ret := 0.221785
								if( mf > 0.116602 )
									ret := -0.102410
						if( ad > -1704.68 )
							if( mf <= 0.188827 )
								if( bbp <= -2.14917 )
									ret := 0.235772
								if( bbp > -2.14917 )
									ret := -0.119295
							if( mf > 0.188827 )
								if( mf <= 0.463885 )
									ret := 0.634146
								if( mf > 0.463885 )
									ret := -0.090909
			if( ad > -579.001 )
				if( bbm <= 0.697349 )
					if( bearPower <= -0.864417 )
						if( bearPower <= -2.45921 )
							if( ad_mf <= 0.043777 )
								if( bbp <= -6.93673 )
									ret := 0.850000 // buy
								if( bbp > -6.93673 )
									ret := 0.705882 // buy
							if( ad_mf > 0.043777 )
								if( bbp <= -6.40729 )
									ret := -0.647059
								if( bbp > -6.40729 )
									ret := 0.764706 // buy
						if( bearPower > -2.45921 )
							if( bullPower <= -1.56734 )
								ret := -0.262712
							if( bullPower > -1.56734 )
								if( bullPower <= -1.29525 )
									ret := 0.351145
								if( bullPower > -1.29525 )
									ret := 0.002488
					if( bearPower > -0.864417 )
						if( bearPower <= -0.258836 )
							if( bullPower <= -0.39423 )
								if( mf <= 0.278806 )
									ret := 0.435311
								if( mf > 0.278806 )
									ret := -0.099010
							if( bullPower > -0.39423 )
								if( bbp <= -1.11424 )
									ret := -0.583333
								if( bbp > -1.11424 )
									ret := 0.194834
						if( bearPower > -0.258836 )
							if( mf <= -0.0064 )
								if( bearPower <= -0.256589 )
									ret := 0.454545
								if( bearPower > -0.256589 )
									ret := 0.777778 // buy
							if( mf > -0.0064 )
								ret := 0.888889 // buy
				if( bbm > 0.697349 )
					if( mf <= -0.161765 )
						ret := -0.076923
					if( mf > -0.161765 )
						if( bbp <= -1.25882 )
							if( bbp <= -2.23424 )
								ret := 0.692308
							if( bbp > -2.23424 )
								ret := 1.000000 // buy
						if( bbp > -1.25882 )
							if( bearPower <= -0.882389 )
								ret := 0.300000
							if( bearPower > -0.882389 )
								ret := 0.750000 // buy
		if( ad_mf > 0.947775 )
			if( bbm <= 1.4085 )
				if( bearPower <= -2.58878 )
					if( bbm <= 1.11257 )
						if( mf <= -0.221335 )
							ret := 0.714286 // buy
						if( mf > -0.221335 )
							if( bbm <= 0.469726 )
								ret := 0.571429
							if( bbm > 0.469726 )
								if( bbm <= 0.847955 )
									ret := 0.964286 // buy
								if( bbm > 0.847955 )
									ret := 0.800000 // buy
					if( bbm > 1.11257 )
						if( bbp <= -5.89807 )
							ret := 0.764706 // buy
						if( bbp > -5.89807 )
							if( bearPower <= -2.9167 )
								if( mf <= -0.19301 )
									ret := 0.733333 // buy
								if( mf > -0.19301 )
									ret := -0.090909
							if( bearPower > -2.9167 )
								if( bbm <= 1.27851 )
									ret := 0.125000
								if( bbm > 1.27851 )
									ret := 0.100000
				if( bearPower > -2.58878 )
					if( bearPower <= -1.48701 )
						if( bbp <= -2.43179 )
							if( mf <= -0.304235 )
								if( ad_mf <= 1795.06 )
									ret := 0.333333
								if( ad_mf > 1795.06 )
									ret := -0.637931
							if( mf > -0.304235 )
								if( bullPower <= -1.72204 )
									ret := -0.560000
								if( bullPower > -1.72204 )
									ret := 0.011976
						if( bbp > -2.43179 )
							if( ad_mf <= 23684.2 )
								if( bbp <= -1.97274 )
									ret := -0.365854
								if( bbp > -1.97274 )
									ret := 0.416667
							if( ad_mf > 23684.2 )
								if( bbp <= -2.27736 )
									ret := -0.714286 // sell
								if( bbp > -2.27736 )
									ret := -1.000000 // sell
					if( bearPower > -1.48701 )
						if( ad_mf <= 34351.4 )
							if( mf <= -0.122296 )
								if( bbm <= 0.557064 )
									ret := -0.071956
								if( bbm > 0.557064 )
									ret := -0.253731
							if( mf > -0.122296 )
								if( bbp <= -1.15473 )
									ret := 0.103121
								if( bbp > -1.15473 )
									ret := -0.015689
						if( ad_mf > 34351.4 )
							if( bearPower <= -0.705522 )
								if( ad <= 37725.9 )
									ret := -0.906977 // sell
								if( ad > 37725.9 )
									ret := -0.265957
							if( bearPower > -0.705522 )
								if( ad <= 71782.3 )
									ret := 0.666667
								if( ad > 71782.3 )
									ret := 0.000000
			if( bbm > 1.4085 )
				if( bbm <= 2.02724 )
					if( ad_mf <= 12020.4 )
						if( ad <= 2272.19 )
							if( ad_mf <= 1860.41 )
								if( ad_mf <= 498.868 )
									ret := 0.166667
								if( ad_mf > 498.868 )
									ret := 0.633333
							if( ad_mf > 1860.41 )
								if( mf <= -0.255219 )
									ret := -0.750000 // sell
								if( mf > -0.255219 )
									ret := -1.000000 // sell
						if( ad > 2272.19 )
							if( ad_mf <= 5275.45 )
								if( bbp <= -1.1124 )
									ret := 0.906250 // buy
								if( bbp > -1.1124 )
									ret := 0.647059
							if( ad_mf > 5275.45 )
								if( bbm <= 1.45864 )
									ret := 0.000000
								if( bbm > 1.45864 )
									ret := 0.666667
					if( ad_mf > 12020.4 )
						if( bearPower <= -1.66177 )
							if( bbm <= 1.79638 )
								if( bbm <= 1.54808 )
									ret := 0.000000
								if( bbm > 1.54808 )
									ret := -0.687500
							if( bbm > 1.79638 )
								if( bearPower <= -3.12368 )
									ret := 0.000000
								if( bearPower > -3.12368 )
									ret := 0.619048
						if( bearPower > -1.66177 )
							if( bearPower <= -1.56187 )
								ret := 1.000000 // buy
							if( bearPower > -1.56187 )
								if( ad_mf <= 41965 )
									ret := -0.215686
								if( ad_mf > 41965 )
									ret := 0.555556
				if( bbm > 2.02724 )
					if( bbp <= -11.0791 )
						if( ad <= 9807.08 )
							ret := -0.125000
						if( ad > 9807.08 )
							ret := 1.000000 // buy
					if( bbp > -11.0791 )
						if( ad_mf <= 129335 )
							if( ad_mf <= 55176.3 )
								if( bullPower <= -2.7604 )
									ret := 0.666667
								if( bullPower > -2.7604 )
									ret := -0.288889
							if( ad_mf > 55176.3 )
								if( ad <= 67369 )
									ret := -1.000000 // sell
								if( ad > 67369 )
									ret := -0.550000
						if( ad_mf > 129335 )
							ret := 1.000000 // buy
	if( bbp > -0.510006 )
		if( ad_mf <= -497.943 )
			if( bearPower <= -0.781033 )
				if( bbp <= -0.031147 )
					if( bbp <= -0.482949 )
						ret := -0.272727
					if( bbp > -0.482949 )
						if( bearPower <= -0.797129 )
							if( ad <= -41167 )
								ret := 0.285714
							if( ad > -41167 )
								if( ad <= -28604.7 )
									ret := 1.000000 // buy
								if( ad > -28604.7 )
									ret := 0.535714
						if( bearPower > -0.797129 )
							ret := 1.000000 // buy
				if( bbp > -0.031147 )
					if( bbm <= 2.37899 )
						if( bearPower <= -0.996418 )
							ret := -0.900000 // sell
						if( bearPower > -0.996418 )
							if( bbm <= 1.9407 )
								ret := -0.285714
							if( bbm > 1.9407 )
								ret := 0.750000 // buy
					if( bbm > 2.37899 )
						if( ad_mf <= -42625.5 )
							ret := 0.000000
						if( ad_mf > -42625.5 )
							if( bearPower <= -1.29252 )
								ret := 1.000000 // buy
							if( bearPower > -1.29252 )
								if( mf <= 0.164318 )
									ret := 0.615385
								if( mf > 0.164318 )
									ret := 1.000000 // buy
			if( bearPower > -0.781033 )
				if( bbm <= 0.12181 )
					if( bearPower <= 0.991369 )
						if( mf <= -0.06057 )
							if( bearPower <= -0.266172 )
								if( bearPower <= -0.283951 )
									ret := -0.230769
								if( bearPower > -0.283951 )
									ret := 0.642857
							if( bearPower > -0.266172 )
								if( ad_mf <= -888.464 )
									ret := -0.162690
								if( ad_mf > -888.464 )
									ret := -0.301020
						if( mf > -0.06057 )
							if( bearPower <= 0.373114 )
								if( bbp <= -0.484376 )
									ret := -0.437500
								if( bbp > -0.484376 )
									ret := -0.020021
							if( bearPower > 0.373114 )
								if( ad_mf <= -3232.88 )
									ret := -0.454545
								if( ad_mf > -3232.88 )
									ret := 0.225806
					if( bearPower > 0.991369 )
						if( bullPower <= 1.46531 )
							ret := 0.800000 // buy
						if( bullPower > 1.46531 )
							ret := 0.000000
				if( bbm > 0.12181 )
					if( ad <= -2227.17 )
						if( bearPower <= -0.705252 )
							if( bbp <= 0.218543 )
								if( bearPower <= -0.735999 )
									ret := -0.111111
								if( bearPower > -0.735999 )
									ret := -0.745763 // sell
							if( bbp > 0.218543 )
								if( BBPower_Color <= 0.5 )
									ret := 0.333333
								if( BBPower_Color > 0.5 )
									ret := -0.090909
						if( bearPower > -0.705252 )
							if( bearPower <= -0.693279 )
								if( bullPower <= 0.478157 )
									ret := 0.562500
								if( bullPower > 0.478157 )
									ret := 0.833333 // buy
							if( bearPower > -0.693279 )
								if( bbm <= 0.405335 )
									ret := -0.029938
								if( bbm > 0.405335 )
									ret := 0.042320
					if( ad > -2227.17 )
						if( bearPower <= 0.799038 )
							if( ad <= -2205.78 )
								if( ad <= -2224.39 )
									ret := 0.062500
								if( ad > -2224.39 )
									ret := 0.647059
							if( ad > -2205.78 )
								if( bullPower <= -0.048997 )
									ret := -0.059880
								if( bullPower > -0.048997 )
									ret := 0.107419
						if( bearPower > 0.799038 )
							if( bullPower <= 2.37835 )
								if( ad <= -651.778 )
									ret := -0.466102
								if( ad > -651.778 )
									ret := 0.368421
							if( bullPower > 2.37835 )
								if( bbp <= 4.7232 )
									ret := -1.000000 // sell
								if( bbp > 4.7232 )
									ret := -0.657895
		if( ad_mf > -497.943 )
			if( bbp <= 0.526122 )
				if( ad_mf <= 83.9273 )
					if( bullPower <= -0.102367 )
						if( bearPower <= -0.124539 )
							if( bullPower <= -0.134503 )
								if( bbp <= -0.446976 )
									ret := -0.081448
								if( bbp > -0.446976 )
									ret := 0.179975
							if( bullPower > -0.134503 )
								if( bearPower <= -0.125406 )
									ret := -0.054217
								if( bearPower > -0.125406 )
									ret := -0.642857
						if( bearPower > -0.124539 )
							if( bbp <= -0.241789 )
								if( ad_mf <= 0.367266 )
									ret := 0.435897
								if( ad_mf > 0.367266 )
									ret := 0.947368 // buy
							if( bbp > -0.241789 )
								if( bearPower <= -0.118703 )
									ret := -0.142857
								if( bearPower > -0.118703 )
									ret := 0.402685
					if( bullPower > -0.102367 )
						if( bearPower <= 0.250139 )
							if( ad_mf <= 0.159742 )
								if( bbm <= 0.295507 )
									ret := -0.075079
								if( bbm > 0.295507 )
									ret := 0.120782
							if( ad_mf > 0.159742 )
								if( ad_mf <= 0.193821 )
									ret := 0.619469
								if( ad_mf > 0.193821 )
									ret := 0.129747
						if( bearPower > 0.250139 )
							if( bearPower <= 0.26117 )
								if( bbp <= 0.517584 )
									ret := 0.413793
								if( bbp > 0.517584 )
									ret := 0.173913
							if( bearPower > 0.26117 )
								ret := -0.136364
				if( ad_mf > 83.9273 )
					if( bullPower <= 0.735294 )
						if( bearPower <= -0.242958 )
							if( ad <= 39585.6 )
								if( bullPower <= -0.057635 )
									ret := -0.020597
								if( bullPower > -0.057635 )
									ret := -0.108389
							if( ad > 39585.6 )
								if( bearPower <= -0.590162 )
									ret := -0.764706 // sell
								if( bearPower > -0.590162 )
									ret := -0.342857
						if( bearPower > -0.242958 )
							if( ad <= 9425.35 )
								if( bbm <= 0.083853 )
									ret := 0.130090
								if( bbm > 0.083853 )
									ret := -0.063286
							if( ad > 9425.35 )
								if( bbp <= 0.372665 )
									ret := 0.177814
								if( bbp > 0.372665 )
									ret := 0.012384
					if( bullPower > 0.735294 )
						if( ad <= 144982 )
							if( ad_mf <= 92730.8 )
								if( mf <= -0.336989 )
									ret := 1.000000 // buy
								if( mf > -0.336989 )
									ret := 0.183036
							if( ad_mf > 92730.8 )
								ret := -1.000000 // sell
						if( ad > 144982 )
							ret := 0.857143 // buy
			if( bbp > 0.526122 )
				if( ad_mf <= 2490.63 )
					if( ad <= 2424.61 )
						if( bearPower <= 0.805822 )
							if( bullPower <= 1.55331 )
								if( mf <= 0.134927 )
									ret := -0.170523
								if( mf > 0.134927 )
									ret := -0.065805
							if( bullPower > 1.55331 )
								if( mf <= -0.122309 )
									ret := -0.692308
								if( mf > -0.122309 )
									ret := -0.976190 // sell
						if( bearPower > 0.805822 )
							if( bullPower <= 0.994871 )
								if( ad <= 393.995 )
									ret := -0.478589
								if( ad > 393.995 )
									ret := -0.076923
							if( bullPower > 0.994871 )
								if( bearPower <= 1.09862 )
									ret := 0.023599
								if( bearPower > 1.09862 )
									ret := -0.332031
					if( ad > 2424.61 )
						if( bearPower <= 0.261713 )
							if( mf <= 0.051609 )
								ret := -1.000000 // sell
							if( mf > 0.051609 )
								ret := -0.105263
						if( bearPower > 0.261713 )
							if( ad_mf <= 2455.69 )
								if( bbp <= 1.02262 )
									ret := -1.000000 // sell
								if( bbp > 1.02262 )
									ret := -0.636364
							if( ad_mf > 2455.69 )
								ret := -0.933333 // sell
				if( ad_mf > 2490.63 )
					if( ad <= 4376 )
						if( bearPower <= 0.510373 )
							if( ad <= 4235.74 )
								if( ad <= 4170.28 )
									ret := 0.013910
								if( ad > 4170.28 )
									ret := -0.469388
							if( ad > 4235.74 )
								if( bbp <= 1.18209 )
									ret := 0.724138 // buy
								if( bbp > 1.18209 )
									ret := 0.384615
						if( bearPower > 0.510373 )
							if( mf <= 0.077845 )
								if( bearPower <= 0.561563 )
									ret := 0.904762 // buy
								if( bearPower > 0.561563 )
									ret := 0.552941
							if( mf > 0.077845 )
								if( ad_mf <= 2717.08 )
									ret := 0.500000
								if( ad_mf > 2717.08 )
									ret := 0.132450
					if( ad > 4376 )
						if( bullPower <= 1.56696 )
							if( ad <= 4694.28 )
								if( bbm <= 0.3608 )
									ret := -0.135922
								if( bbm > 0.3608 )
									ret := -0.517986
							if( ad > 4694.28 )
								if( ad <= 4782.51 )
									ret := 0.527027
								if( ad > 4782.51 )
									ret := -0.070969
						if( bullPower > 1.56696 )
							if( ad_mf <= 171305 )
								if( ad <= 119643 )
									ret := 0.053310
								if( ad > 119643 )
									ret := -0.536585
							if( ad_mf > 171305 )
								if( bbm <= 3.44542 )
									ret := 0.157895
								if( bbm > 3.44542 )
									ret := 0.833333 // buy
	
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
float op_operation = decision_tree_0_CRWD_1Min_e04edbec(bearPower, bbm, bbp, bullPower, BBPower_Color, mf, ad_mf, ad)

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


