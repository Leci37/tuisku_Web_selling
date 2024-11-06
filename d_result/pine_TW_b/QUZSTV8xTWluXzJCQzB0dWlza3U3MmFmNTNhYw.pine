//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Chaikin_Money_Flow
// ID_model: AFRM_1Min_2BC0_72af53ac Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AFRM_1Min_2BC0_72af53ac", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AFRM_1Min_72af53ac(bullPower, bbp, bearPower, bbm, BBPower_Color, ad, mf, ad_mf)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( bearPower <= 0.047724 )
		if( bbm <= 4.7e-05 )
			if( bearPower <= -0.009038 )
				if( bullPower <= -0.053557 )
					if( mf <= 0.345704 )
						if( bullPower <= -0.074942 )
							if( bullPower <= -0.127592 )
								if( mf <= -0.052297 )
									ret := 0.611979
								if( mf > -0.052297 )
									ret := 0.281250
							if( bullPower > -0.127592 )
								if( ad_mf <= -0.230915 )
									ret := 0.647482
								if( ad_mf > -0.230915 )
									ret := 0.229314
						if( bullPower > -0.074942 )
							if( bullPower <= -0.066006 )
								if( mf <= -0.139727 )
									ret := 0.223881
								if( mf > -0.139727 )
									ret := 0.763441 // buy
							if( bullPower > -0.066006 )
								if( ad_mf <= -0.104102 )
									ret := 0.802326 // buy
								if( ad_mf > -0.104102 )
									ret := 0.297688
					if( mf > 0.345704 )
						if( ad_mf <= -0.656779 )
							if( bbp <= -0.123134 )
								if( bullPower <= -0.072248 )
									ret := 0.300000
								if( bullPower > -0.072248 )
									ret := 1.000000 // buy
							if( bbp > -0.123134 )
								ret := 0.200000
						if( ad_mf > -0.656779 )
							if( ad_mf <= -0.602601 )
								if( mf <= 0.625186 )
									ret := -0.227273
								if( mf > 0.625186 )
									ret := -0.800000 // sell
							if( ad_mf > -0.602601 )
								if( ad_mf <= -0.587219 )
									ret := 1.000000 // buy
								if( ad_mf > -0.587219 )
									ret := 0.097403
				if( bullPower > -0.053557 )
					if( ad_mf <= 0.143915 )
						if( bbp <= -0.100251 )
							if( ad_mf <= 0.036513 )
								if( mf <= 0.088884 )
									ret := -0.680851
								if( mf > 0.088884 )
									ret := -0.092593
							if( ad_mf > 0.036513 )
								if( mf <= -0.100953 )
									ret := 1.000000 // buy
								if( mf > -0.100953 )
									ret := 0.600000
						if( bbp > -0.100251 )
							if( mf <= 0.743273 )
								if( bbp <= -0.096592 )
									ret := 0.583333
								if( bbp > -0.096592 )
									ret := 0.276654
							if( mf > 0.743273 )
								if( ad_mf <= -0.816103 )
									ret := 0.333333
								if( ad_mf > -0.816103 )
									ret := -0.875000 // sell
					if( ad_mf > 0.143915 )
						if( ad_mf <= 0.201923 )
							if( mf <= -0.156057 )
								if( mf <= -0.183128 )
									ret := -0.288660
								if( mf > -0.183128 )
									ret := 0.152542
							if( mf > -0.156057 )
								if( bbp <= -0.09007 )
									ret := 0.230769
								if( bbp > -0.09007 )
									ret := -0.605263
						if( ad_mf > 0.201923 )
							if( ad_mf <= 0.234892 )
								if( bullPower <= -0.038095 )
									ret := 0.772727 // buy
								if( bullPower > -0.038095 )
									ret := 0.377358
							if( ad_mf > 0.234892 )
								if( bbp <= -0.092374 )
									ret := -0.225352
								if( bbp > -0.092374 )
									ret := 0.142631
			if( bearPower > -0.009038 )
				if( bearPower <= 0.011308 )
					if( bearPower <= -0.008954 )
						ret := -0.900000 // sell
					if( bearPower > -0.008954 )
						if( ad_mf <= -0.257049 )
							if( bbp <= 0.011593 )
								if( bearPower <= 0.003356 )
									ret := 0.306818
								if( bearPower > 0.003356 )
									ret := 0.583333
							if( bbp > 0.011593 )
								if( ad_mf <= -0.367317 )
									ret := -0.433333
								if( ad_mf > -0.367317 )
									ret := 0.655172
						if( ad_mf > -0.257049 )
							if( bearPower <= 0.004368 )
								if( bearPower <= -0.008557 )
									ret := 0.228571
								if( bearPower > -0.008557 )
									ret := -0.018583
							if( bearPower > 0.004368 )
								if( ad_mf <= -0.19689 )
									ret := -0.400000
								if( ad_mf > -0.19689 )
									ret := 0.232274
				if( bearPower > 0.011308 )
					if( ad_mf <= -0.40991 )
						if( bbp <= 0.067424 )
							if( ad_mf <= -0.60623 )
								if( mf <= 0.7482 )
									ret := -0.307692
								if( mf > 0.7482 )
									ret := 0.066667
							if( ad_mf > -0.60623 )
								if( bearPower <= 0.025444 )
									ret := -0.753086 // sell
								if( bearPower > 0.025444 )
									ret := -0.564103
						if( bbp > 0.067424 )
							if( bearPower <= 0.038702 )
								if( bbp <= 0.072204 )
									ret := -0.214286
								if( bbp > 0.072204 )
									ret := -0.066667
							if( bearPower > 0.038702 )
								if( bearPower <= 0.042895 )
									ret := 0.450000
								if( bearPower > 0.042895 )
									ret := -0.200000
					if( ad_mf > -0.40991 )
						if( bbp <= 0.084079 )
							if( bullPower <= 0.02934 )
								if( bbp <= 0.058432 )
									ret := -0.075065
								if( bbp > 0.058432 )
									ret := 0.307692
							if( bullPower > 0.02934 )
								if( bearPower <= 0.032929 )
									ret := -0.382883
								if( bearPower > 0.032929 )
									ret := -0.162844
						if( bbp > 0.084079 )
							if( ad_mf <= 0.277364 )
								if( ad_mf <= -0.360377 )
									ret := 0.857143 // buy
								if( ad_mf > -0.360377 )
									ret := 0.200893
							if( ad_mf > 0.277364 )
								if( bbp <= 0.092398 )
									ret := -0.615385
								if( bbp > 0.092398 )
									ret := 0.000000
		if( bbm > 4.7e-05 )
			if( ad <= 11.5151 )
				if( bbp <= 0.296281 )
					if( ad_mf <= -8179.73 )
						if( ad <= -24327.3 )
							if( bearPower <= -0.113435 )
								if( bullPower <= -0.348025 )
									ret := -0.369231
								if( bullPower > -0.348025 )
									ret := 0.025043
							if( bearPower > -0.113435 )
								if( bullPower <= -0.036423 )
									ret := 0.565217
								if( bullPower > -0.036423 )
									ret := 0.170716
						if( ad > -24327.3 )
							if( ad_mf <= -8309.8 )
								if( bbm <= 0.336402 )
									ret := -0.048089
								if( bbm > 0.336402 )
									ret := 0.522727
							if( ad_mf > -8309.8 )
								if( bbm <= 0.031045 )
									ret := 0.500000
								if( bbm > 0.031045 )
									ret := -0.559322
					if( ad_mf > -8179.73 )
						if( ad <= -8152.93 )
							if( bearPower <= -0.065825 )
								ret := 1.000000 // buy
							if( bearPower > -0.065825 )
								ret := 0.714286 // buy
						if( ad > -8152.93 )
							if( bbp <= 0.239133 )
								if( bbm <= 0.066517 )
									ret := 0.019027
								if( bbm > 0.066517 )
									ret := 0.122768
							if( bbp > 0.239133 )
								if( bullPower <= 0.255105 )
									ret := 0.791667 // buy
								if( bullPower > 0.255105 )
									ret := 0.500000
				if( bbp > 0.296281 )
					if( ad <= -163138 )
						ret := -0.400000
					if( ad > -163138 )
						if( bbm <= 0.442175 )
							if( bullPower <= 0.278732 )
								ret := 1.000000 // buy
							if( bullPower > 0.278732 )
								if( mf <= -0.087531 )
									ret := -0.714286 // sell
								if( mf > -0.087531 )
									ret := 0.440000
						if( bbm > 0.442175 )
							if( mf <= -0.327666 )
								ret := -0.125000
							if( mf > -0.327666 )
								if( mf <= 0.040888 )
									ret := 1.000000 // buy
								if( mf > 0.040888 )
									ret := 0.562500
			if( ad > 11.5151 )
				if( bearPower <= -0.823841 )
					if( ad_mf <= 2480.93 )
						ret := 1.000000 // buy
					if( ad_mf > 2480.93 )
						if( mf <= -0.173203 )
							ret := -0.437500
						if( mf > -0.173203 )
							if( mf <= 0.07448 )
								ret := 0.714286 // buy
							if( mf > 0.07448 )
								ret := -0.250000
				if( bearPower > -0.823841 )
					if( bullPower <= 0.027093 )
						if( ad_mf <= 4767.5 )
							if( bbm <= 0.02001 )
								if( mf <= 0.113379 )
									ret := -0.004854
								if( mf > 0.113379 )
									ret := 0.151899
							if( bbm > 0.02001 )
								if( bullPower <= -0.098145 )
									ret := 0.104449
								if( bullPower > -0.098145 )
									ret := -0.086372
						if( ad_mf > 4767.5 )
							if( bbm <= 0.087819 )
								if( mf <= -0.321099 )
									ret := 0.361111
								if( mf > -0.321099 )
									ret := 0.084725
							if( bbm > 0.087819 )
								if( bullPower <= -0.369775 )
									ret := -0.755102 // sell
								if( bullPower > -0.369775 )
									ret := -0.021469
					if( bullPower > 0.027093 )
						if( bbp <= -0.019202 )
							if( ad_mf <= 3047.49 )
								if( bbm <= 0.391838 )
									ret := -0.635294
								if( bbm > 0.391838 )
									ret := 0.411765
							if( ad_mf > 3047.49 )
								if( bbp <= -0.09243 )
									ret := -0.316151
								if( bbp > -0.09243 )
									ret := -0.082327
						if( bbp > -0.019202 )
							if( ad <= 1856.67 )
								if( bbm <= 0.050029 )
									ret := -0.041958
								if( bbm > 0.050029 )
									ret := -0.457143
							if( ad > 1856.67 )
								if( ad_mf <= 238219 )
									ret := -0.007223
								if( ad_mf > 238219 )
									ret := -0.509434
	if( bearPower > 0.047724 )
		if( bbm <= 5.6e-05 )
			if( ad_mf <= -0.206753 )
				if( mf <= 0.256903 )
					if( bullPower <= 0.298321 )
						if( bullPower <= 0.166903 )
							if( bearPower <= 0.066657 )
								if( ad_mf <= -0.233005 )
									ret := 0.666667
								if( ad_mf > -0.233005 )
									ret := -0.090909
							if( bearPower > 0.066657 )
								if( ad_mf <= -0.220177 )
									ret := -0.035714
								if( ad_mf > -0.220177 )
									ret := -0.512821
						if( bullPower > 0.166903 )
							if( bullPower <= 0.19598 )
								ret := 1.000000 // buy
							if( bullPower > 0.19598 )
								if( bbp <= 0.431968 )
									ret := -0.583333
								if( bbp > 0.431968 )
									ret := 0.666667
					if( bullPower > 0.298321 )
						ret := -1.000000 // sell
				if( mf > 0.256903 )
					if( ad_mf <= -0.722819 )
						if( bbp <= 0.142011 )
							ret := 0.642857
						if( bbp > 0.142011 )
							if( bullPower <= 0.098061 )
								ret := -0.285714
							if( bullPower > 0.098061 )
								ret := 0.238095
					if( ad_mf > -0.722819 )
						if( bullPower <= 0.358015 )
							if( bullPower <= 0.147452 )
								if( bbp <= 0.211279 )
									ret := -0.350775
								if( bbp > 0.211279 )
									ret := -0.033493
							if( bullPower > 0.147452 )
								if( ad_mf <= -0.346016 )
									ret := -0.471204
								if( ad_mf > -0.346016 )
									ret := -0.900000 // sell
						if( bullPower > 0.358015 )
							if( mf <= 0.348467 )
								ret := 0.714286 // buy
							if( mf > 0.348467 )
								ret := 0.357143
			if( ad_mf > -0.206753 )
				if( ad_mf <= 0.099575 )
					if( bbp <= 0.914393 )
						if( bbp <= 0.220542 )
							if( ad_mf <= -0.147958 )
								if( bearPower <= 0.080034 )
									ret := -0.763636 // sell
								if( bearPower > 0.080034 )
									ret := -0.428571
							if( ad_mf > -0.147958 )
								if( bbp <= 0.100338 )
									ret := -0.763889 // sell
								if( bbp > 0.100338 )
									ret := -0.346753
						if( bbp > 0.220542 )
							if( bbp <= 0.307981 )
								if( bearPower <= 0.140917 )
									ret := -0.780645 // sell
								if( bearPower > 0.140917 )
									ret := -0.924528 // sell
							if( bbp > 0.307981 )
								if( mf <= -0.032032 )
									ret := -0.951613 // sell
								if( mf > -0.032032 )
									ret := -0.355670
					if( bbp > 0.914393 )
						ret := 0.272727
				if( ad_mf > 0.099575 )
					if( mf <= -0.105856 )
						if( mf <= -0.575191 )
							if( mf <= -0.624858 )
								if( bearPower <= 0.105626 )
									ret := -0.075000
								if( bearPower > 0.105626 )
									ret := -0.965517 // sell
							if( mf > -0.624858 )
								if( ad_mf <= 0.592472 )
									ret := -0.846154 // sell
								if( ad_mf > 0.592472 )
									ret := -1.000000 // sell
						if( mf > -0.575191 )
							if( ad_mf <= 0.408301 )
								if( bullPower <= 0.055517 )
									ret := -0.037500
								if( bullPower > 0.055517 )
									ret := -0.456425
							if( ad_mf > 0.408301 )
								if( bullPower <= 0.118147 )
									ret := 0.245902
								if( bullPower > 0.118147 )
									ret := -0.277778
					if( mf > -0.105856 )
						if( mf <= -0.102004 )
							ret := 0.933333 // buy
						if( mf > -0.102004 )
							ret := 0.333333
		if( bbm > 5.6e-05 )
			if( mf <= -0.337873 )
				if( ad_mf <= -423.726 )
					if( bearPower <= 0.055937 )
						ret := 0.909091 // buy
					if( bearPower > 0.055937 )
						if( bullPower <= 0.103118 )
							ret := 0.066667
						if( bullPower > 0.103118 )
							if( bbm <= 0.063537 )
								if( ad <= -1536.17 )
									ret := 0.437500
								if( ad > -1536.17 )
									ret := 0.615385
							if( bbm > 0.063537 )
								ret := 0.764706 // buy
				if( ad_mf > -423.726 )
					if( bbp <= 0.251153 )
						if( bullPower <= 0.113597 )
							if( bbp <= 0.148411 )
								ret := -0.071429
							if( bbp > 0.148411 )
								ret := -0.500000
						if( bullPower > 0.113597 )
							ret := 0.235294
					if( bbp > 0.251153 )
						if( mf <= -0.470348 )
							ret := -0.333333
						if( mf > -0.470348 )
							ret := -0.750000 // sell
			if( mf > -0.337873 )
				if( ad_mf <= 65665.4 )
					if( ad_mf <= -207134 )
						if( mf <= 0.098597 )
							if( bbp <= 0.375776 )
								ret := 0.666667
							if( bbp > 0.375776 )
								ret := 1.000000 // buy
						if( mf > 0.098597 )
							ret := 0.266667
					if( ad_mf > -207134 )
						if( bearPower <= 0.047984 )
							if( ad <= 4814.93 )
								if( mf <= 0.055652 )
									ret := -0.090909
								if( mf > 0.055652 )
									ret := -0.541667
							if( ad > 4814.93 )
								ret := -0.727273 // sell
						if( bearPower > 0.047984 )
							if( mf <= -0.307764 )
								if( ad_mf <= 1204.29 )
									ret := -0.555556
								if( ad_mf > 1204.29 )
									ret := -0.916667 // sell
							if( mf > -0.307764 )
								if( bullPower <= 1.86855 )
									ret := -0.022736
								if( bullPower > 1.86855 )
									ret := 1.000000 // buy
				if( ad_mf > 65665.4 )
					if( bbm <= 0.513804 )
						if( ad <= 76525.7 )
							if( ad_mf <= 71802.1 )
								if( bullPower <= 0.363175 )
									ret := -0.705882 // sell
								if( bullPower > 0.363175 )
									ret := -1.000000 // sell
							if( ad_mf > 71802.1 )
								if( bullPower <= 0.301727 )
									ret := -0.785714 // sell
								if( bullPower > 0.301727 )
									ret := -0.590909
						if( ad > 76525.7 )
							if( bullPower <= 0.295623 )
								if( mf <= 0.338388 )
									ret := 0.145833
								if( mf > 0.338388 )
									ret := -0.454545
							if( bullPower > 0.295623 )
								if( bearPower <= 0.084544 )
									ret := -0.642857
								if( bearPower > 0.084544 )
									ret := -0.344828
					if( bbm > 0.513804 )
						if( bullPower <= 0.985895 )
							ret := 0.076923
						if( bullPower > 0.985895 )
							if( ad_mf <= 180194 )
								ret := 0.500000
							if( ad_mf > 180194 )
								if( ad_mf <= 274220 )
									ret := 1.000000 // buy
								if( ad_mf > 274220 )
									ret := 0.727273 // buy
	
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
float op_operation = decision_tree_0_AFRM_1Min_72af53ac(bullPower, bbp, bearPower, bbm, BBPower_Color, ad, mf, ad_mf)

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


