//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Vortex_Indicator
// ID_model: SNAP_1Min_2CV0_3989dce2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNAP_1Min_2CV0_3989dce2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNAP_1Min_3989dce2(mf, ad, ad_mf, VIP_VIM, VIM, VIP)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ad_mf <= 0.810097 )
		if( VIP_VIM <= 0.079386 )
			if( VIP_VIM <= 0.057472 )
				if( VIP <= 1.09004 )
					if( VIP_VIM <= -0.925675 )
						if( VIM <= 2.625 )
							if( VIP <= 0.717376 )
								if( VIP <= 0.492728 )
									ret := 0.631579
								if( VIP > 0.492728 )
									ret := 0.163043
							if( VIP > 0.717376 )
								if( mf <= 0.152007 )
									ret := 0.752212 // buy
								if( mf > 0.152007 )
									ret := -0.642857
						if( VIM > 2.625 )
							ret := -0.800000 // sell
					if( VIP_VIM > -0.925675 )
						if( ad_mf <= -46254.9 )
							if( VIP <= 1.02536 )
								if( ad <= -726898 )
									ret := 0.666667
								if( ad > -726898 )
									ret := 0.137581
							if( VIP > 1.02536 )
								if( VIP <= 1.03226 )
									ret := -0.617021
								if( VIP > 1.03226 )
									ret := -0.018868
						if( ad_mf > -46254.9 )
							if( mf <= 0.419238 )
								if( VIP <= 0.931197 )
									ret := -0.010786
								if( VIP > 0.931197 )
									ret := 0.056524
							if( mf > 0.419238 )
								if( VIP <= 1.03663 )
									ret := 0.544118
								if( VIP > 1.03663 )
									ret := -0.184211
				if( VIP > 1.09004 )
					if( VIM <= 2.82989 )
						if( VIM <= 1.31082 )
							if( VIP_VIM <= 0.013602 )
								if( VIP <= 1.10181 )
									ret := 0.483333
								if( VIP > 1.10181 )
									ret := 0.125000
							if( VIP_VIM > 0.013602 )
								if( VIM <= 1.0795 )
									ret := 0.187500
								if( VIM > 1.0795 )
									ret := -0.327869
						if( VIM > 1.31082 )
							if( ad_mf <= -0.743564 )
								if( ad_mf <= -28659.2 )
									ret := -0.086957
								if( ad_mf > -28659.2 )
									ret := 0.393898
							if( ad_mf > -0.743564 )
								if( VIP <= 2.2641 )
									ret := 0.136447
								if( VIP > 2.2641 )
									ret := 0.417683
					if( VIM > 2.82989 )
						if( mf <= -0.378823 )
							if( VIP_VIM <= -1.96713 )
								if( VIP_VIM <= -2.1 )
									ret := 0.437500
								if( VIP_VIM > -2.1 )
									ret := -0.517241
							if( VIP_VIM > -1.96713 )
								if( mf <= -0.38445 )
									ret := 0.355609
								if( mf > -0.38445 )
									ret := 0.866667 // buy
						if( mf > -0.378823 )
							if( ad <= -354.09 )
								if( ad_mf <= -15958.6 )
									ret := -0.800000 // sell
								if( ad_mf > -15958.6 )
									ret := 0.361465
							if( ad > -354.09 )
								if( VIP <= 1804.34 )
									ret := 0.012702
								if( VIP > 1804.34 )
									ret := 0.764706 // buy
			if( VIP_VIM > 0.057472 )
				if( ad_mf <= 0.189874 )
					if( ad_mf <= 0.091707 )
						if( ad_mf <= -0.066789 )
							if( VIM <= 1.9098 )
								if( VIP_VIM <= 0.058296 )
									ret := 0.725000 // buy
								if( VIP_VIM > 0.058296 )
									ret := 0.210184
							if( VIM > 1.9098 )
								if( VIP_VIM <= 0.071799 )
									ret := 0.571429
								if( VIP_VIM > 0.071799 )
									ret := 0.833333 // buy
						if( ad_mf > -0.066789 )
							if( mf <= -0.018712 )
								if( VIM <= 2.11127 )
									ret := 0.066667
								if( VIM > 2.11127 )
									ret := 0.166667
							if( mf > -0.018712 )
								if( VIM <= 1.31862 )
									ret := -0.375000
								if( VIM > 1.31862 )
									ret := 0.000000
					if( ad_mf > 0.091707 )
						if( ad_mf <= 0.155274 )
							if( ad_mf <= 0.13451 )
								ret := 0.500000
							if( ad_mf > 0.13451 )
								ret := 0.941176 // buy
						if( ad_mf > 0.155274 )
							ret := 0.363636
				if( ad_mf > 0.189874 )
					if( ad_mf <= 0.372859 )
						ret := -0.850000 // sell
					if( ad_mf > 0.372859 )
						ret := 0.181818
		if( VIP_VIM > 0.079386 )
			if( VIM <= 2.94242 )
				if( ad_mf <= 0.02086 )
					if( VIP <= 1.91393 )
						if( ad <= -67314 )
							if( ad_mf <= -67476.1 )
								if( VIM <= 0.934022 )
									ret := -0.037895
								if( VIM > 0.934022 )
									ret := -0.327586
							if( ad_mf > -67476.1 )
								ret := -1.000000 // sell
						if( ad > -67314 )
							if( VIP_VIM <= 0.432929 )
								if( ad <= -26649.9 )
									ret := 0.112094
								if( ad > -26649.9 )
									ret := 0.009525
							if( VIP_VIM > 0.432929 )
								if( ad_mf <= -26409.7 )
									ret := 0.089181
								if( ad_mf > -26409.7 )
									ret := -0.111416
					if( VIP > 1.91393 )
						if( ad_mf <= -0.84073 )
							if( VIP <= 3.1717 )
								if( VIM <= 1.28396 )
									ret := -0.054054
								if( VIM > 1.28396 )
									ret := 0.441237
							if( VIP > 3.1717 )
								if( VIP <= 3.31197 )
									ret := -0.636364
								if( VIP > 3.31197 )
									ret := 0.285714
						if( ad_mf > -0.84073 )
							if( VIP_VIM <= 0.247333 )
								if( VIP <= 2.09861 )
									ret := 0.156250
								if( VIP > 2.09861 )
									ret := 0.659341
							if( VIP_VIM > 0.247333 )
								if( ad_mf <= -0.466685 )
									ret := -0.355469
								if( ad_mf > -0.466685 )
									ret := 0.031001
				if( ad_mf > 0.02086 )
					if( VIP <= 2.68158 )
						if( ad_mf <= 0.084784 )
							if( VIM <= 0.977272 )
								if( VIM <= 0.959153 )
									ret := -0.355422
								if( VIM > 0.959153 )
									ret := -0.861111 // sell
							if( VIM > 0.977272 )
								if( VIM <= 1.10831 )
									ret := 0.250000
								if( VIM > 1.10831 )
									ret := -0.162393
						if( ad_mf > 0.084784 )
							if( VIM <= 0.816243 )
								if( mf <= -0.096223 )
									ret := 0.382716
								if( mf > -0.096223 )
									ret := -0.333333
							if( VIM > 0.816243 )
								if( VIM <= 0.882052 )
									ret := -0.335443
								if( VIM > 0.882052 )
									ret := -0.047716
					if( VIP > 2.68158 )
						if( mf <= -0.506749 )
							if( ad_mf <= 0.599917 )
								ret := 0.700000 // buy
							if( ad_mf > 0.599917 )
								ret := 0.000000
						if( mf > -0.506749 )
							if( ad_mf <= 0.080348 )
								if( ad_mf <= 0.07097 )
									ret := -0.200000
								if( ad_mf > 0.07097 )
									ret := 0.642857
							if( ad_mf > 0.080348 )
								if( VIP <= 3.01946 )
									ret := -0.400000
								if( VIP > 3.01946 )
									ret := -0.723577 // sell
			if( VIM > 2.94242 )
				if( ad_mf <= -0.036612 )
					if( ad <= -225.044 )
						if( ad_mf <= -306.267 )
							if( mf <= -0.18717 )
								if( VIP <= 5.47673 )
									ret := 0.807692 // buy
								if( VIP > 5.47673 )
									ret := 0.333333
							if( mf > -0.18717 )
								if( VIM <= 4.09369 )
									ret := 0.346667
								if( VIM > 4.09369 )
									ret := -0.114943
						if( ad_mf > -306.267 )
							ret := 0.791667 // buy
					if( ad > -225.044 )
						if( VIM <= 4.93438 )
							if( VIP <= 5.27355 )
								if( VIP_VIM <= 0.139541 )
									ret := 0.833333 // buy
								if( VIP_VIM > 0.139541 )
									ret := 0.005348
							if( VIP > 5.27355 )
								if( mf <= 0.540676 )
									ret := 0.602273
								if( mf > 0.540676 )
									ret := -0.500000
						if( VIM > 4.93438 )
							if( VIM <= 319.25 )
								if( ad_mf <= -0.257979 )
									ret := -0.470297
								if( ad_mf > -0.257979 )
									ret := 0.010444
							if( VIM > 319.25 )
								if( VIM <= 739.145 )
									ret := -0.700000 // sell
								if( VIM > 739.145 )
									ret := -0.894737 // sell
				if( ad_mf > -0.036612 )
					if( VIP <= 4.20207 )
						if( ad_mf <= 0.054343 )
							if( VIM <= 3.55685 )
								if( VIP <= 3.68493 )
									ret := 0.500000
								if( VIP > 3.68493 )
									ret := 0.892308 // buy
							if( VIM > 3.55685 )
								ret := 0.153846
						if( ad_mf > 0.054343 )
							if( ad_mf <= 0.072023 )
								ret := -0.363636
							if( ad_mf > 0.072023 )
								if( VIP <= 3.97417 )
									ret := 0.139241
								if( VIP > 3.97417 )
									ret := 0.690476
					if( VIP > 4.20207 )
						if( VIM <= 11.4751 )
							if( VIM <= 7.95871 )
								if( VIP_VIM <= 2.00552 )
									ret := 0.195609
								if( VIP_VIM > 2.00552 )
									ret := -0.772727 // sell
							if( VIM > 7.95871 )
								if( VIP_VIM <= 0.664688 )
									ret := -0.688889
								if( VIP_VIM > 0.664688 )
									ret := 0.000000
						if( VIM > 11.4751 )
							if( VIP <= 15.8489 )
								if( mf <= -0.055501 )
									ret := 0.951220 // buy
								if( mf > -0.055501 )
									ret := 0.588235
							if( VIP > 15.8489 )
								if( VIP_VIM <= 4.86284 )
									ret := 0.044776
								if( VIP_VIM > 4.86284 )
									ret := 0.826087 // buy
	if( ad_mf > 0.810097 )
		if( mf <= 0.263732 )
			if( VIM <= 1.41807 )
				if( ad <= 116.929 )
					if( VIP_VIM <= 0.01801 )
						if( ad_mf <= 103.754 )
							if( ad_mf <= 86.939 )
								if( mf <= 0.000747 )
									ret := -0.500000
								if( mf > 0.000747 )
									ret := 0.111111
							if( ad_mf > 86.939 )
								if( VIP_VIM <= -0.229726 )
									ret := 0.187500
								if( VIP_VIM > -0.229726 )
									ret := 0.687500
						if( ad_mf > 103.754 )
							if( mf <= 0.018256 )
								if( VIP <= 0.883753 )
									ret := -0.800000 // sell
								if( VIP > 0.883753 )
									ret := -0.818182 // sell
							if( mf > 0.018256 )
								ret := -0.538462
					if( VIP_VIM > 0.01801 )
						if( VIM <= 0.902404 )
							if( VIP_VIM <= 0.332046 )
								ret := -0.333333
							if( VIP_VIM > 0.332046 )
								ret := -0.588235
						if( VIM > 0.902404 )
							if( VIP <= 1.06613 )
								ret := -0.500000
							if( VIP > 1.06613 )
								if( VIP_VIM <= 0.351019 )
									ret := -1.000000 // sell
								if( VIP_VIM > 0.351019 )
									ret := -0.600000
				if( ad > 116.929 )
					if( VIP_VIM <= 1.01146 )
						if( ad_mf <= 260.21 )
							if( ad <= 191.279 )
								if( VIM <= 1.10496 )
									ret := 0.206186
								if( VIM > 1.10496 )
									ret := -0.416667
							if( ad > 191.279 )
								if( mf <= 0.098098 )
									ret := 0.612069
								if( mf > 0.098098 )
									ret := -0.500000
						if( ad_mf > 260.21 )
							if( ad <= 438948 )
								if( VIP <= 1.30729 )
									ret := -0.053575
								if( VIP > 1.30729 )
									ret := -0.180680
							if( ad > 438948 )
								if( VIM <= 0.992587 )
									ret := -0.666667
								if( VIM > 0.992587 )
									ret := -0.025641
					if( VIP_VIM > 1.01146 )
						if( VIP <= 2.08464 )
							ret := -0.666667
						if( VIP > 2.08464 )
							ret := -0.846154 // sell
			if( VIM > 1.41807 )
				if( VIP_VIM <= -0.488669 )
					if( mf <= -0.048849 )
						if( mf <= -0.068333 )
							if( VIP_VIM <= -0.92132 )
								if( VIP <= 0.541547 )
									ret := -0.166667
								if( VIP > 0.541547 )
									ret := 0.397590
							if( VIP_VIM > -0.92132 )
								if( ad <= 2308.33 )
									ret := 0.146341
								if( ad > 2308.33 )
									ret := -0.144330
						if( mf > -0.068333 )
							ret := 0.826087 // buy
					if( mf > -0.048849 )
						if( VIP_VIM <= -0.494615 )
							if( ad <= 682.867 )
								if( ad_mf <= 482.108 )
									ret := -0.259259
								if( ad_mf > 482.108 )
									ret := -0.913043 // sell
							if( ad > 682.867 )
								if( VIM <= 1.65009 )
									ret := -0.408163
								if( VIM > 1.65009 )
									ret := -0.049261
						if( VIP_VIM > -0.494615 )
							ret := 1.000000 // buy
				if( VIP_VIM > -0.488669 )
					if( ad_mf <= 24.1383 )
						if( mf <= -0.86303 )
							if( VIM <= 1.76927 )
								if( VIP_VIM <= 0.440238 )
									ret := 0.000000
								if( VIP_VIM > 0.440238 )
									ret := -0.363636
							if( VIM > 1.76927 )
								if( VIP_VIM <= 0.695098 )
									ret := 0.000000
								if( VIP_VIM > 0.695098 )
									ret := 0.250000
						if( mf > -0.86303 )
							ret := 0.454545
					if( ad_mf > 24.1383 )
						if( VIM <= 10.2198 )
							if( VIP_VIM <= 0.719616 )
								if( ad_mf <= 415.106 )
									ret := -0.553191
								if( ad_mf > 415.106 )
									ret := -0.262235
							if( VIP_VIM > 0.719616 )
								if( VIP <= 3.12491 )
									ret := -0.792683 // sell
								if( VIP > 3.12491 )
									ret := -0.386364
						if( VIM > 10.2198 )
							if( ad_mf <= 2050.88 )
								if( VIP <= 29.1857 )
									ret := -0.340909
								if( VIP > 29.1857 )
									ret := 0.500000
							if( ad_mf > 2050.88 )
								ret := 0.520000
		if( mf > 0.263732 )
			if( ad <= 140578 )
				if( ad_mf <= 123417 )
					if( ad <= 118978 )
						if( VIP <= 1.38268 )
							if( VIP_VIM <= -0.297354 )
								if( ad <= 64684.8 )
									ret := 0.184466
								if( ad > 64684.8 )
									ret := 0.916667 // buy
							if( VIP_VIM > -0.297354 )
								if( mf <= 0.285771 )
									ret := -0.198319
								if( mf > 0.285771 )
									ret := -0.082328
						if( VIP > 1.38268 )
							if( VIP <= 2.18832 )
								if( mf <= 0.802869 )
									ret := -0.396450
								if( mf > 0.802869 )
									ret := 0.357143
							if( VIP > 2.18832 )
								if( VIP <= 3.26592 )
									ret := -0.046875
								if( VIP > 3.26592 )
									ret := -0.430303
					if( ad > 118978 )
						if( VIP <= 1.15095 )
							ret := -0.571429
						if( VIP > 1.15095 )
							ret := -1.000000 // sell
				if( ad_mf > 123417 )
					if( VIP <= 1.09426 )
						ret := -0.250000
					if( VIP > 1.09426 )
						if( VIP_VIM <= 0.341246 )
							ret := 0.866667 // buy
						if( VIP_VIM > 0.341246 )
							ret := 0.642857
			if( ad > 140578 )
				if( VIP_VIM <= 0.699646 )
					if( VIP_VIM <= 0.348248 )
						if( VIM <= 0.861261 )
							if( VIP <= 1.04054 )
								ret := 1.000000 // buy
							if( VIP > 1.04054 )
								if( ad_mf <= 181088 )
									ret := 0.500000
								if( ad_mf > 181088 )
									ret := -0.575000
						if( VIM > 0.861261 )
							if( VIP_VIM <= 0.096332 )
								if( ad <= 186737 )
									ret := -0.666667
								if( ad > 186737 )
									ret := -0.162791
							if( VIP_VIM > 0.096332 )
								if( ad_mf <= 566711 )
									ret := -0.888889 // sell
								if( ad_mf > 566711 )
									ret := -0.360000
					if( VIP_VIM > 0.348248 )
						if( mf <= 0.422764 )
							if( VIM <= 0.75159 )
								if( ad <= 300354 )
									ret := -0.767442 // sell
								if( ad > 300354 )
									ret := 0.333333
							if( VIM > 0.75159 )
								if( VIP <= 1.20802 )
									ret := -1.000000 // sell
								if( VIP > 1.20802 )
									ret := -0.789474 // sell
						if( mf > 0.422764 )
							if( VIP_VIM <= 0.480026 )
								if( VIP_VIM <= 0.457578 )
									ret := -1.000000 // sell
								if( VIP_VIM > 0.457578 )
									ret := -0.600000
							if( VIP_VIM > 0.480026 )
								ret := -1.000000 // sell
				if( VIP_VIM > 0.699646 )
					if( VIM <= 0.590379 )
						ret := 0.500000
					if( VIM > 0.590379 )
						if( VIP <= 1.37061 )
							ret := 0.545455
						if( VIP > 1.37061 )
							ret := -0.800000 // sell
	
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
float op_operation = decision_tree_0_SNAP_1Min_3989dce2(mf, ad, ad_mf, VIP_VIM, VIM, VIP)

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


