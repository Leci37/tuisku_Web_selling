//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Vortex_Indicator
// ID_model: PYPL_1Min_2CV0_98b07842 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PYPL_1Min_2CV0_98b07842", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PYPL_1Min_98b07842(mf, ad_mf, ad, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ad <= 13.3638 )
		if( VIP <= 12.9292 )
			if( mf <= 0.519571 )
				if( VIM <= 1.18178 )
					if( VIP <= 1.58899 )
						if( ad_mf <= -42244.2 )
							if( VIP <= 1.28772 )
								if( VIP_VIM <= -0.26724 )
									ret := 0.373402
								if( VIP_VIM > -0.26724 )
									ret := 0.161635
							if( VIP > 1.28772 )
								if( mf <= 0.131486 )
									ret := -0.688525
								if( mf > 0.131486 )
									ret := -0.197802
						if( ad_mf > -42244.2 )
							if( ad <= -27461.3 )
								if( VIM <= 0.968408 )
									ret := 0.002176
								if( VIM > 0.968408 )
									ret := -0.199689
							if( ad > -27461.3 )
								if( ad_mf <= 0.668303 )
									ret := 0.000120
								if( ad_mf > 0.668303 )
									ret := -0.884615 // sell
					if( VIP > 1.58899 )
						if( mf <= 0.224872 )
							if( VIP_VIM <= 0.587742 )
								ret := -0.642857
							if( VIP_VIM > 0.587742 )
								if( VIM <= 0.497052 )
									ret := 1.000000 // buy
								if( VIM > 0.497052 )
									ret := 0.125749
						if( mf > 0.224872 )
							if( VIP <= 1.70919 )
								if( mf <= 0.32429 )
									ret := 1.000000 // buy
								if( mf > 0.32429 )
									ret := 0.700000 // buy
							if( VIP > 1.70919 )
								if( VIP_VIM <= 0.762175 )
									ret := -0.538462
								if( VIP_VIM > 0.762175 )
									ret := 0.378049
				if( VIM > 1.18178 )
					if( VIP_VIM <= 0.22343 )
						if( VIM <= 12.7796 )
							if( VIP <= 5.45537 )
								if( ad <= -6039.62 )
									ret := 0.015632
								if( ad > -6039.62 )
									ret := 0.131436
							if( VIP > 5.45537 )
								if( ad_mf <= 0.11684 )
									ret := -0.084843
								if( ad_mf > 0.11684 )
									ret := 0.139493
						if( VIM > 12.7796 )
							if( VIM <= 13.5261 )
								if( mf <= 0.04103 )
									ret := -0.705128 // sell
								if( mf > 0.04103 )
									ret := 0.111111
							if( VIM > 13.5261 )
								if( mf <= -0.065924 )
									ret := 0.619048
								if( mf > -0.065924 )
									ret := -0.466667
					if( VIP_VIM > 0.22343 )
						if( VIP_VIM <= 1.70644 )
							if( ad <= -1639.5 )
								if( ad_mf <= -4479.42 )
									ret := -0.253731
								if( ad_mf > -4479.42 )
									ret := 0.368627
							if( ad > -1639.5 )
								if( ad_mf <= -0.015085 )
									ret := -0.012982
								if( ad_mf > -0.015085 )
									ret := -0.172185
						if( VIP_VIM > 1.70644 )
							if( VIM <= 6.95994 )
								if( VIP_VIM <= 2.11653 )
									ret := 0.629630
								if( VIP_VIM > 2.11653 )
									ret := -0.384615
							if( VIM > 6.95994 )
								if( VIM <= 7.19117 )
									ret := -0.400000
								if( VIM > 7.19117 )
									ret := 0.125000
			if( mf > 0.519571 )
				if( VIP_VIM <= -0.039227 )
					if( VIP <= 4.62271 )
						if( VIM <= 3.43333 )
							if( VIP_VIM <= -0.643909 )
								if( mf <= 0.609423 )
									ret := 0.444444
								if( mf > 0.609423 )
									ret := 0.805970 // buy
							if( VIP_VIM > -0.643909 )
								if( ad_mf <= -2951.46 )
									ret := 0.500000
								if( ad_mf > -2951.46 )
									ret := -0.035294
						if( VIM > 3.43333 )
							if( mf <= 0.874885 )
								if( ad_mf <= -0.812732 )
									ret := 0.555556
								if( ad_mf > -0.812732 )
									ret := 0.000000
							if( mf > 0.874885 )
								ret := -0.761905 // sell
					if( VIP > 4.62271 )
						if( ad_mf <= -0.732645 )
							ret := -0.461538
						if( ad_mf > -0.732645 )
							ret := -0.875000 // sell
				if( VIP_VIM > -0.039227 )
					if( ad_mf <= -0.649734 )
						if( ad_mf <= -0.83826 )
							if( VIP_VIM <= 1.00026 )
								if( VIP_VIM <= 0.051527 )
									ret := 0.259259
								if( VIP_VIM > 0.051527 )
									ret := -0.371560
							if( VIP_VIM > 1.00026 )
								ret := 0.600000
						if( ad_mf > -0.83826 )
							if( VIP <= 4.61562 )
								if( VIM <= 2.6737 )
									ret := 0.100000
								if( VIM > 2.6737 )
									ret := 0.571429
							if( VIP > 4.61562 )
								if( VIP <= 5.68878 )
									ret := -1.000000 // sell
								if( VIP > 5.68878 )
									ret := -0.083333
					if( ad_mf > -0.649734 )
						if( VIP <= 3.11961 )
							if( VIP_VIM <= 1.11469 )
								if( VIP <= 2.9733 )
									ret := -0.490741
								if( VIP > 2.9733 )
									ret := -0.964286 // sell
							if( VIP_VIM > 1.11469 )
								ret := 0.545455
						if( VIP > 3.11961 )
							if( VIP <= 3.37763 )
								ret := 0.600000
							if( VIP > 3.37763 )
								if( ad_mf <= -0.559837 )
									ret := -0.603175
								if( ad_mf > -0.559837 )
									ret := 0.000000
		if( VIP > 12.9292 )
			if( ad_mf <= 0.253574 )
				if( ad_mf <= 0.164453 )
					if( VIM <= 138.905 )
						if( VIM <= 85.7696 )
							if( VIM <= 75.8478 )
								if( VIP_VIM <= 1.48672 )
									ret := 0.142399
								if( VIP_VIM > 1.48672 )
									ret := 0.345821
							if( VIM > 75.8478 )
								if( VIP <= 77.7286 )
									ret := -0.833333 // sell
								if( VIP > 77.7286 )
									ret := -0.318182
						if( VIM > 85.7696 )
							if( VIP_VIM <= -1.02941 )
								ret := 1.000000 // buy
							if( VIP_VIM > -1.02941 )
								if( ad_mf <= -0.043838 )
									ret := 0.416667
								if( ad_mf > -0.043838 )
									ret := 0.500000
					if( VIM > 138.905 )
						if( ad_mf <= -0.004404 )
							if( VIP <= 2199.38 )
								ret := 0.315789
							if( VIP > 2199.38 )
								if( VIP_VIM <= 0.033859 )
									ret := 0.538462
								if( VIP_VIM > 0.033859 )
									ret := -1.000000 // sell
						if( ad_mf > -0.004404 )
							if( VIP <= 5300 )
								if( VIP <= 683.81 )
									ret := -0.605263
								if( VIP > 683.81 )
									ret := 0.135135
							if( VIP > 5300 )
								ret := -0.833333 // sell
				if( ad_mf > 0.164453 )
					if( VIM <= 20.2192 )
						if( VIM <= 15.2065 )
							ret := 0.125000
						if( VIM > 15.2065 )
							ret := -0.450000
					if( VIM > 20.2192 )
						if( VIM <= 274.477 )
							if( VIP <= 54.2655 )
								if( VIM <= 25.1378 )
									ret := 0.888889 // buy
								if( VIM > 25.1378 )
									ret := 0.258621
							if( VIP > 54.2655 )
								if( ad_mf <= 0.227225 )
									ret := 0.902778 // buy
								if( ad_mf > 0.227225 )
									ret := 0.650000
						if( VIM > 274.477 )
							ret := -0.307692
			if( ad_mf > 0.253574 )
				if( VIM <= 22.9122 )
					if( VIP <= 15.2868 )
						if( VIM <= 14.4054 )
							ret := 0.562500
						if( VIM > 14.4054 )
							if( VIP_VIM <= -1.25598 )
								ret := -0.454545
							if( VIP_VIM > -1.25598 )
								ret := -1.000000 // sell
					if( VIP > 15.2868 )
						if( VIM <= 16.9116 )
							ret := 0.882353 // buy
						if( VIM > 16.9116 )
							if( mf <= -0.331822 )
								if( VIP_VIM <= -0.004013 )
									ret := 0.791667 // buy
								if( VIP_VIM > -0.004013 )
									ret := 0.642857
							if( mf > -0.331822 )
								ret := -0.333333
				if( VIM > 22.9122 )
					if( VIP <= 44.045 )
						if( ad_mf <= 0.515641 )
							if( VIP_VIM <= -1.77315 )
								ret := 0.000000
							if( VIP_VIM > -1.77315 )
								if( VIM <= 25.4246 )
									ret := -0.333333
								if( VIM > 25.4246 )
									ret := -0.883721 // sell
						if( ad_mf > 0.515641 )
							ret := -0.090909
					if( VIP > 44.045 )
						if( VIP <= 59.1073 )
							ret := 0.416667
						if( VIP > 59.1073 )
							ret := -0.400000
	if( ad > 13.3638 )
		if( mf <= 0.009364 )
			if( VIM <= 1.21736 )
				if( VIP <= 1.17804 )
					if( ad <= 162870 )
						if( ad <= 182.875 )
							if( VIM <= 1.15174 )
								if( mf <= -0.224723 )
									ret := -0.833333 // sell
								if( mf > -0.224723 )
									ret := -0.571429
							if( VIM > 1.15174 )
								ret := 0.000000
						if( ad > 182.875 )
							if( ad <= 145978 )
								if( VIP_VIM <= -0.355025 )
									ret := -0.040795
								if( VIP_VIM > -0.355025 )
									ret := 0.047132
							if( ad > 145978 )
								ret := 0.823529 // buy
					if( ad > 162870 )
						if( VIP <= 0.898291 )
							if( ad_mf <= 191949 )
								ret := -1.000000 // sell
							if( ad_mf > 191949 )
								ret := -0.800000 // sell
						if( VIP > 0.898291 )
							ret := -0.666667
				if( VIP > 1.17804 )
					if( ad_mf <= 3119.09 )
						if( ad_mf <= 290.453 )
							ret := 0.285714
						if( ad_mf > 290.453 )
							if( VIP_VIM <= 0.045097 )
								ret := 0.222222
							if( VIP_VIM > 0.045097 )
								if( ad <= 1478.56 )
									ret := -0.564356
								if( ad > 1478.56 )
									ret := -0.330986
					if( ad_mf > 3119.09 )
						if( ad_mf <= 6287.32 )
							if( VIM <= 0.933887 )
								if( ad_mf <= 4210.09 )
									ret := -0.205128
								if( ad_mf > 4210.09 )
									ret := 0.212598
							if( VIM > 0.933887 )
								if( VIP_VIM <= 0.39223 )
									ret := 0.500000
								if( VIP_VIM > 0.39223 )
									ret := 1.000000 // buy
						if( ad_mf > 6287.32 )
							if( VIP_VIM <= 0.583731 )
								if( VIM <= 0.990891 )
									ret := -0.168367
								if( VIM > 0.990891 )
									ret := -0.868421 // sell
							if( VIP_VIM > 0.583731 )
								if( VIP <= 1.32848 )
									ret := 0.647059
								if( VIP > 1.32848 )
									ret := -0.090909
			if( VIM > 1.21736 )
				if( ad <= 31764.1 )
					if( VIP_VIM <= -0.371246 )
						if( VIM <= 1.56047 )
							if( VIP_VIM <= -0.771651 )
								if( ad_mf <= 1241.62 )
									ret := 0.600000
								if( ad_mf > 1241.62 )
									ret := -0.213636
							if( VIP_VIM > -0.771651 )
								if( VIP_VIM <= -0.699448 )
									ret := 0.153409
								if( VIP_VIM > -0.699448 )
									ret := -0.037621
						if( VIM > 1.56047 )
							if( mf <= -0.269026 )
								if( VIP_VIM <= -1.05843 )
									ret := -0.111111
								if( VIP_VIM > -1.05843 )
									ret := 0.616667
							if( mf > -0.269026 )
								if( ad_mf <= 348.892 )
									ret := -0.333333
								if( ad_mf > 348.892 )
									ret := 0.022556
					if( VIP_VIM > -0.371246 )
						if( ad <= 1140.92 )
							if( mf <= -0.386428 )
								if( ad <= 410.629 )
									ret := -0.636364
								if( ad > 410.629 )
									ret := 0.197802
							if( mf > -0.386428 )
								if( VIP <= 7.04546 )
									ret := -0.450617
								if( VIP > 7.04546 )
									ret := 0.025641
						if( ad > 1140.92 )
							if( ad <= 2050.38 )
								if( ad <= 1503 )
									ret := -0.088050
								if( ad > 1503 )
									ret := 0.387597
							if( ad > 2050.38 )
								if( ad_mf <= 2642.83 )
									ret := -0.623077
								if( ad_mf > 2642.83 )
									ret := -0.034602
				if( ad > 31764.1 )
					if( VIP <= 0.703871 )
						if( ad_mf <= 67209.9 )
							if( ad_mf <= 40034.3 )
								if( mf <= -0.106355 )
									ret := 0.060606
								if( mf > -0.106355 )
									ret := -0.727273 // sell
							if( ad_mf > 40034.3 )
								if( VIP <= 0.6594 )
									ret := 0.851852 // buy
								if( VIP > 0.6594 )
									ret := 0.222222
						if( ad_mf > 67209.9 )
							if( ad_mf <= 83406.7 )
								ret := -0.846154 // sell
							if( ad_mf > 83406.7 )
								ret := 0.111111
					if( VIP > 0.703871 )
						if( ad_mf <= 62356.9 )
							if( VIM <= 1.29829 )
								if( VIP_VIM <= -0.495138 )
									ret := 0.333333
								if( VIP_VIM > -0.495138 )
									ret := 0.673077
							if( VIM > 1.29829 )
								if( mf <= -0.379867 )
									ret := 0.400000
								if( mf > -0.379867 )
									ret := 0.885714 // buy
						if( ad_mf > 62356.9 )
							if( VIM <= 1.31065 )
								if( VIP_VIM <= -0.504213 )
									ret := 0.777778 // buy
								if( VIP_VIM > -0.504213 )
									ret := -0.333333
							if( VIM > 1.31065 )
								ret := -0.909091 // sell
		if( mf > 0.009364 )
			if( ad <= 144964 )
				if( VIP_VIM <= -0.887678 )
					if( ad <= 1521.12 )
						if( VIM <= 4.45975 )
							if( VIM <= 3.14597 )
								ret := 0.647059
							if( VIM > 3.14597 )
								if( VIM <= 3.76928 )
									ret := 1.000000 // buy
								if( VIM > 3.76928 )
									ret := 0.769231 // buy
						if( VIM > 4.45975 )
							ret := 0.333333
					if( ad > 1521.12 )
						if( ad <= 1859.5 )
							ret := -0.500000
						if( ad > 1859.5 )
							ret := 0.055556
				if( VIP_VIM > -0.887678 )
					if( ad_mf <= 1198.55 )
						if( ad <= 1132.5 )
							if( ad <= 1101.88 )
								if( mf <= 0.886356 )
									ret := -0.209215
								if( mf > 0.886356 )
									ret := -0.666667
							if( ad > 1101.88 )
								if( ad_mf <= 1119.53 )
									ret := 0.617021
								if( ad_mf > 1119.53 )
									ret := -0.125000
						if( ad > 1132.5 )
							if( ad <= 1158.6 )
								ret := -0.733333 // sell
							if( ad > 1158.6 )
								if( mf <= 0.07839 )
									ret := -0.769231 // sell
								if( mf > 0.07839 )
									ret := -1.000000 // sell
					if( ad_mf > 1198.55 )
						if( ad_mf <= 16287.7 )
							if( ad_mf <= 15177.6 )
								if( VIM <= 0.921213 )
									ret := -0.004841
								if( VIM > 0.921213 )
									ret := -0.064260
							if( ad_mf > 15177.6 )
								if( mf <= 0.462516 )
									ret := 0.248649
								if( mf > 0.462516 )
									ret := -0.600000
						if( ad_mf > 16287.7 )
							if( VIP <= 1.31707 )
								if( ad <= 111066 )
									ret := -0.145696
								if( ad > 111066 )
									ret := 0.357143
							if( VIP > 1.31707 )
								if( VIP_VIM <= -0.531637 )
									ret := 0.846154 // buy
								if( VIP_VIM > -0.531637 )
									ret := 0.003077
			if( ad > 144964 )
				if( ad <= 161878 )
					if( VIP_VIM <= 0.25743 )
						ret := -1.000000 // sell
					if( VIP_VIM > 0.25743 )
						ret := -0.687500
				if( ad > 161878 )
					if( mf <= 0.464688 )
						if( VIP_VIM <= 0.196619 )
							if( ad <= 269728 )
								if( VIM <= 0.986941 )
									ret := 0.434783
								if( VIM > 0.986941 )
									ret := -0.521739
							if( ad > 269728 )
								if( VIP_VIM <= -0.036537 )
									ret := -0.720000 // sell
								if( VIP_VIM > -0.036537 )
									ret := -1.000000 // sell
						if( VIP_VIM > 0.196619 )
							if( VIP_VIM <= 0.643673 )
								if( ad <= 195307 )
									ret := -0.857143 // sell
								if( ad > 195307 )
									ret := -0.985294 // sell
							if( VIP_VIM > 0.643673 )
								ret := -0.578947
					if( mf > 0.464688 )
						if( mf <= 0.82453 )
							if( VIP_VIM <= 0.481428 )
								if( VIP_VIM <= 0.112263 )
									ret := -0.400000
								if( VIP_VIM > 0.112263 )
									ret := 0.446154
							if( VIP_VIM > 0.481428 )
								if( VIP_VIM <= 0.595939 )
									ret := -1.000000 // sell
								if( VIP_VIM > 0.595939 )
									ret := -0.333333
						if( mf > 0.82453 )
							ret := -0.588235
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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

//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_PYPL_1Min_98b07842(mf, ad_mf, ad, VIP, VIP_VIM, VIM)

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


