//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Vortex_Indicator
// ID_model: AMD_30Min_2CV0_906b14ae Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMD_30Min_2CV0_906b14ae", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMD_30Min_906b14ae(ad, mf, ad_mf, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ad <= 8.16266e+06 )
		if( ad <= 357.097 )
			if( ad <= -19279.8 )
				if( VIP <= 0.914209 )
					if( ad <= -719239 )
						if( mf <= -0.465807 )
							if( VIP <= 0.675251 )
								if( VIM <= 1.31675 )
									ret := 0.057143
								if( VIM > 1.31675 )
									ret := -0.303571
							if( VIP > 0.675251 )
								if( ad <= -1.62973e+07 )
									ret := 0.268293
								if( ad > -1.62973e+07 )
									ret := -0.318293
						if( mf > -0.465807 )
							if( ad_mf <= -3.84419e+06 )
								if( VIM <= 1.0676 )
									ret := 0.131250
								if( VIM > 1.0676 )
									ret := -0.071369
							if( ad_mf > -3.84419e+06 )
								if( VIP <= 0.625543 )
									ret := 0.243902
								if( VIP > 0.625543 )
									ret := -0.120818
					if( ad > -719239 )
						if( VIP_VIM <= -0.194817 )
							if( ad <= -20383.8 )
								if( VIM <= 1.09178 )
									ret := 0.213650
								if( VIM > 1.09178 )
									ret := 0.035155
							if( ad > -20383.8 )
								if( VIP_VIM <= -0.46473 )
									ret := 0.043478
								if( VIP_VIM > -0.46473 )
									ret := -0.580000
						if( VIP_VIM > -0.194817 )
							if( ad <= -141269 )
								if( VIM <= 1.03477 )
									ret := 0.181250
								if( VIM > 1.03477 )
									ret := -0.125000
							if( ad > -141269 )
								if( VIM <= 0.944736 )
									ret := -0.661765
								if( VIM > 0.944736 )
									ret := -0.262626
				if( VIP > 0.914209 )
					if( ad_mf <= -157902 )
						if( VIM <= 1.2947 )
							if( ad_mf <= -169595 )
								if( ad_mf <= -1.9971e+07 )
									ret := 0.661017
								if( ad_mf > -1.9971e+07 )
									ret := 0.023202
							if( ad_mf > -169595 )
								if( VIP_VIM <= -0.081903 )
									ret := -0.150000
								if( VIP_VIM > -0.081903 )
									ret := 0.603053
						if( VIM > 1.2947 )
							if( VIP_VIM <= -0.494411 )
								ret := 0.642857
							if( VIP_VIM > -0.494411 )
								if( ad <= -164124 )
									ret := -0.401709
								if( ad > -164124 )
									ret := -1.000000 // sell
					if( ad_mf > -157902 )
						if( VIM <= 1.02597 )
							if( ad <= -154099 )
								if( VIP_VIM <= 0.220587 )
									ret := -0.920000 // sell
								if( VIP_VIM > 0.220587 )
									ret := -0.538462
							if( ad > -154099 )
								if( mf <= -0.304078 )
									ret := -0.295337
								if( mf > -0.304078 )
									ret := -0.096526
						if( VIM > 1.02597 )
							if( ad_mf <= -112094 )
								if( ad_mf <= -125618 )
									ret := 0.000000
								if( ad_mf > -125618 )
									ret := -0.458015
							if( ad_mf > -112094 )
								if( ad_mf <= -79969 )
									ret := 0.318408
								if( ad_mf > -79969 )
									ret := 0.040963
			if( ad > -19279.8 )
				if( ad_mf <= -8120.16 )
					if( ad <= -8838.98 )
						if( VIP_VIM <= 0.440944 )
							if( ad_mf <= -10347.9 )
								if( ad <= -10504.1 )
									ret := 0.195386
								if( ad > -10504.1 )
									ret := 0.493333
							if( ad_mf > -10347.9 )
								if( VIM <= 0.956744 )
									ret := 0.384615
								if( VIM > 0.956744 )
									ret := -0.086372
						if( VIP_VIM > 0.440944 )
							if( ad <= -10337 )
								if( ad <= -12150.3 )
									ret := -0.025547
								if( ad > -12150.3 )
									ret := -0.402299
							if( ad > -10337 )
								if( mf <= 0.157826 )
									ret := 0.258065
								if( mf > 0.157826 )
									ret := 0.606061
					if( ad > -8838.98 )
						if( ad <= -8523.81 )
							if( VIP_VIM <= 0.22658 )
								if( ad_mf <= -8584.39 )
									ret := 0.524752
								if( ad_mf > -8584.39 )
									ret := 0.909091 // buy
							if( VIP_VIM > 0.22658 )
								if( VIP_VIM <= 0.451802 )
									ret := -0.086957
								if( VIP_VIM > 0.451802 )
									ret := 0.636364
						if( ad > -8523.81 )
							if( mf <= 0.226987 )
								if( ad <= -8498.66 )
									ret := -0.900000 // sell
								if( ad > -8498.66 )
									ret := 0.432927
							if( mf > 0.226987 )
								if( VIM <= 1.01075 )
									ret := 0.000000
								if( VIM > 1.01075 )
									ret := -0.904762 // sell
				if( ad_mf > -8120.16 )
					if( VIP <= 1.40259 )
						if( ad_mf <= -7649.07 )
							if( VIP_VIM <= -0.12138 )
								if( ad <= -7737.57 )
									ret := -0.400000
								if( ad > -7737.57 )
									ret := -0.857143 // sell
							if( VIP_VIM > -0.12138 )
								if( mf <= -0.115432 )
									ret := -0.444444
								if( mf > -0.115432 )
									ret := 0.275000
						if( ad_mf > -7649.07 )
							if( mf <= 0.351107 )
								if( mf <= -0.212735 )
									ret := 0.022059
								if( mf > -0.212735 )
									ret := 0.110036
							if( mf > 0.351107 )
								if( VIP <= 1.13435 )
									ret := -0.392473
								if( VIP > 1.13435 )
									ret := 0.150649
					if( VIP > 1.40259 )
						if( VIM <= 1.14432 )
							if( VIP <= 1.45265 )
								if( VIM <= 0.649622 )
									ret := -0.645161
								if( VIM > 0.649622 )
									ret := -0.069444
							if( VIP > 1.45265 )
								if( VIP <= 1.60541 )
									ret := 0.181287
								if( VIP > 1.60541 )
									ret := -0.114286
						if( VIM > 1.14432 )
							if( mf <= -0.023684 )
								if( VIM <= 2.27279 )
									ret := -0.676692
								if( VIM > 2.27279 )
									ret := 1.000000 // buy
							if( mf > -0.023684 )
								if( ad_mf <= -5422.59 )
									ret := -0.916667 // sell
								if( ad_mf > -5422.59 )
									ret := 0.053333
		if( ad > 357.097 )
			if( VIP_VIM <= 0.552636 )
				if( VIM <= 1.32849 )
					if( ad <= 7.8633e+06 )
						if( mf <= -0.145123 )
							if( VIM <= 0.985343 )
								if( VIP <= 1.20213 )
									ret := -0.206362
								if( VIP > 1.20213 )
									ret := -0.019481
							if( VIM > 0.985343 )
								if( VIP_VIM <= -0.511402 )
									ret := -0.200295
								if( VIP_VIM > -0.511402 )
									ret := -0.037446
						if( mf > -0.145123 )
							if( VIM <= 1.18576 )
								if( VIP <= 0.638238 )
									ret := 0.692308
								if( VIP > 0.638238 )
									ret := -0.025984
							if( VIM > 1.18576 )
								if( VIP_VIM <= -0.079242 )
									ret := 0.075114
								if( VIP_VIM > -0.079242 )
									ret := -0.257143
					if( ad > 7.8633e+06 )
						if( VIP_VIM <= -0.285229 )
							ret := 0.187500
						if( VIP_VIM > -0.285229 )
							if( ad_mf <= 7.89904e+06 )
								ret := -1.000000 // sell
							if( ad_mf > 7.89904e+06 )
								if( VIM <= 0.769418 )
									ret := 0.090909
								if( VIM > 0.769418 )
									ret := -0.592593
				if( VIM > 1.32849 )
					if( VIP_VIM <= -0.198852 )
						if( VIP <= 0.68415 )
							if( ad <= 4.56026e+06 )
								if( VIM <= 1.61526 )
									ret := -0.009804
								if( VIM > 1.61526 )
									ret := -0.666667
							if( ad > 4.56026e+06 )
								ret := 0.526316
						if( VIP > 0.68415 )
							if( ad_mf <= 4544.31 )
								if( ad <= 3290.05 )
									ret := 0.227106
								if( ad > 3290.05 )
									ret := 0.656250
							if( ad_mf > 4544.31 )
								if( VIP_VIM <= -0.512264 )
									ret := 0.272358
								if( VIP_VIM > -0.512264 )
									ret := -0.092949
					if( VIP_VIM > -0.198852 )
						if( VIM <= 1.33563 )
							ret := 0.375000
						if( VIM > 1.33563 )
							if( ad <= 35891.4 )
								if( VIP_VIM <= -0.162366 )
									ret := -0.722222 // sell
								if( VIP_VIM > -0.162366 )
									ret := -0.242152
							if( ad > 35891.4 )
								if( VIP <= 1.46825 )
									ret := 0.055556
								if( VIP > 1.46825 )
									ret := 0.733333 // buy
			if( VIP_VIM > 0.552636 )
				if( ad <= 1.95279e+06 )
					if( ad_mf <= 1583.14 )
						if( ad_mf <= 1470.89 )
							if( ad_mf <= 1089.81 )
								if( mf <= 0.297174 )
									ret := -0.277778
								if( mf > 0.297174 )
									ret := -0.647059
							if( ad_mf > 1089.81 )
								if( ad_mf <= 1349.09 )
									ret := 0.000000
								if( ad_mf > 1349.09 )
									ret := 0.416667
						if( ad_mf > 1470.89 )
							ret := -0.700000 // sell
					if( ad_mf > 1583.14 )
						if( VIP <= 2.17773 )
							if( ad <= 8997.71 )
								if( ad <= 4886.89 )
									ret := -0.005102
								if( ad > 4886.89 )
									ret := 0.294416
							if( ad > 8997.71 )
								if( VIM <= 0.526865 )
									ret := 0.273810
								if( VIM > 0.526865 )
									ret := -0.052437
						if( VIP > 2.17773 )
							ret := 0.952381 // buy
				if( ad > 1.95279e+06 )
					if( VIM <= 0.645664 )
						if( ad <= 2.43271e+06 )
							if( ad_mf <= 2.40147e+06 )
								if( VIM <= 0.615345 )
									ret := 0.488372
								if( VIM > 0.615345 )
									ret := 0.100000
							if( ad_mf > 2.40147e+06 )
								ret := 1.000000 // buy
						if( ad > 2.43271e+06 )
							if( VIP <= 1.16733 )
								ret := 0.750000 // buy
							if( VIP > 1.16733 )
								if( VIP <= 1.37125 )
									ret := -0.150000
								if( VIP > 1.37125 )
									ret := 0.101010
					if( VIM > 0.645664 )
						if( VIP_VIM <= 0.646025 )
							if( mf <= 0.328725 )
								if( VIP <= 1.2995 )
									ret := -0.095745
								if( VIP > 1.2995 )
									ret := 0.517241
							if( mf > 0.328725 )
								if( mf <= 0.585379 )
									ret := 0.347222
								if( mf > 0.585379 )
									ret := 0.644444
						if( VIP_VIM > 0.646025 )
							if( ad <= 4.46323e+06 )
								if( ad <= 2.47452e+06 )
									ret := 0.740000 // buy
								if( ad > 2.47452e+06 )
									ret := 0.358974
							if( ad > 4.46323e+06 )
								if( VIP <= 1.42662 )
									ret := 0.785714 // buy
								if( VIP > 1.42662 )
									ret := 1.000000 // buy
	if( ad > 8.16266e+06 )
		if( VIP_VIM <= 0.267061 )
			if( VIM <= 1.16378 )
				if( VIP <= 0.951317 )
					if( ad_mf <= 1.39206e+07 )
						if( ad <= 9.3489e+06 )
							if( VIM <= 0.899456 )
								if( ad_mf <= 8.599e+06 )
									ret := 1.000000 // buy
								if( ad_mf > 8.599e+06 )
									ret := 0.500000
							if( VIM > 0.899456 )
								if( mf <= 0.254194 )
									ret := -0.052632
								if( mf > 0.254194 )
									ret := -0.666667
						if( ad > 9.3489e+06 )
							if( ad <= 1.16665e+07 )
								if( ad <= 9.43392e+06 )
									ret := 0.400000
								if( ad > 9.43392e+06 )
									ret := 0.845238 // buy
							if( ad > 1.16665e+07 )
								if( ad_mf <= 1.21752e+07 )
									ret := -0.777778 // sell
								if( ad_mf > 1.21752e+07 )
									ret := 0.560976
					if( ad_mf > 1.39206e+07 )
						if( VIM <= 0.769132 )
							ret := 1.000000 // buy
						if( VIM > 0.769132 )
							if( ad <= 1.49192e+07 )
								ret := -1.000000 // sell
							if( ad > 1.49192e+07 )
								if( VIP_VIM <= -0.276892 )
									ret := -1.000000 // sell
								if( VIP_VIM > -0.276892 )
									ret := -0.322581
				if( VIP > 0.951317 )
					if( VIM <= 0.922933 )
						if( ad_mf <= 1.02199e+07 )
							if( VIP_VIM <= 0.250008 )
								if( ad <= 8.96714e+06 )
									ret := 0.062500
								if( ad > 8.96714e+06 )
									ret := 0.568966
							if( VIP_VIM > 0.250008 )
								ret := -0.461538
						if( ad_mf > 1.02199e+07 )
							if( VIP <= 0.999092 )
								if( VIM <= 0.802056 )
									ret := -0.913043 // sell
								if( VIM > 0.802056 )
									ret := -0.421053
							if( VIP > 0.999092 )
								if( VIP <= 1.04549 )
									ret := -0.150000
								if( VIP > 1.04549 )
									ret := 0.266667
					if( VIM > 0.922933 )
						if( VIP_VIM <= 0.021505 )
							if( ad <= 9.59608e+06 )
								ret := -0.538462
							if( ad > 9.59608e+06 )
								ret := -0.888889 // sell
						if( VIP_VIM > 0.021505 )
							if( VIP_VIM <= 0.050889 )
								ret := 0.307692
							if( VIP_VIM > 0.050889 )
								ret := -0.555556
			if( VIM > 1.16378 )
				if( ad <= 8.67765e+06 )
					ret := 0.923077 // buy
				if( ad > 8.67765e+06 )
					if( ad_mf <= 1.0416e+07 )
						if( VIP_VIM <= -0.503266 )
							ret := 0.416667
						if( VIP_VIM > -0.503266 )
							ret := 0.666667
					if( ad_mf > 1.0416e+07 )
						ret := 0.300000
		if( VIP_VIM > 0.267061 )
			if( ad_mf <= 1.21918e+07 )
				if( VIP <= 1.11622 )
					if( VIP <= 1.09797 )
						if( mf <= 0.484617 )
							if( VIP_VIM <= 0.321695 )
								ret := -0.181818
							if( VIP_VIM > 0.321695 )
								ret := 0.500000
						if( mf > 0.484617 )
							if( VIP <= 1.05377 )
								ret := 0.894737 // buy
							if( VIP > 1.05377 )
								ret := 0.500000
					if( VIP > 1.09797 )
						if( ad_mf <= 9.30666e+06 )
							ret := 0.961538 // buy
						if( ad_mf > 9.30666e+06 )
							if( mf <= 0.521411 )
								ret := 1.000000 // buy
							if( mf > 0.521411 )
								ret := 0.400000
				if( VIP > 1.11622 )
					if( VIP_VIM <= 0.872398 )
						if( ad_mf <= 9.56358e+06 )
							if( ad_mf <= 9.35077e+06 )
								if( mf <= 0.713936 )
									ret := 0.252336
								if( mf > 0.713936 )
									ret := 0.812500 // buy
							if( ad_mf > 9.35077e+06 )
								if( VIM <= 0.591349 )
									ret := -0.875000 // sell
								if( VIM > 0.591349 )
									ret := -0.200000
						if( ad_mf > 9.56358e+06 )
							if( VIM <= 0.743226 )
								if( VIP <= 1.37611 )
									ret := 0.593750
								if( VIP > 1.37611 )
									ret := 1.000000 // buy
							if( VIM > 0.743226 )
								if( mf <= 0.310092 )
									ret := 0.565217
								if( mf > 0.310092 )
									ret := -0.173913
					if( VIP_VIM > 0.872398 )
						if( ad <= 9.08312e+06 )
							ret := -0.785714 // sell
						if( ad > 9.08312e+06 )
							if( ad_mf <= 1.00961e+07 )
								ret := 0.600000
							if( ad_mf > 1.00961e+07 )
								ret := -0.111111
			if( ad_mf > 1.21918e+07 )
				if( VIP_VIM <= 0.301771 )
					ret := 0.750000 // buy
				if( VIP_VIM > 0.301771 )
					if( ad <= 1.96598e+07 )
						if( mf <= 0.474654 )
							if( VIP <= 1.14855 )
								ret := 0.900000 // buy
							if( VIP > 1.14855 )
								if( VIP <= 1.2251 )
									ret := 0.400000
								if( VIP > 1.2251 )
									ret := -0.058824
						if( mf > 0.474654 )
							if( ad_mf <= 1.77972e+07 )
								if( VIP <= 1.07595 )
									ret := -0.850000 // sell
								if( VIP > 1.07595 )
									ret := -0.150000
							if( ad_mf > 1.77972e+07 )
								ret := 0.941176 // buy
					if( ad > 1.96598e+07 )
						if( VIM <= 0.58755 )
							if( VIP_VIM <= 0.688118 )
								ret := 0.500000
							if( VIP_VIM > 0.688118 )
								ret := -0.769231 // sell
						if( VIM > 0.58755 )
							ret := -0.700000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_AMD_30Min_906b14ae(ad, mf, ad_mf, VIP, VIM, VIP_VIM)

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


