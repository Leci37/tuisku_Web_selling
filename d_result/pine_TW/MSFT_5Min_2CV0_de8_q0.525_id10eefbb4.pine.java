//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Vortex_Indicator
// ID_model: MSFT_5Min_2CV0_10eefbb4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_5Min_2CV0_10eefbb4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_5Min_10eefbb4(mf, ad_mf, ad, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ad <= 2056.2 )
		if( VIP <= 1.44865 )
			if( mf <= -0.236249 )
				if( VIP <= 0.937578 )
					if( mf <= -0.543423 )
						if( VIP_VIM <= -0.060044 )
							if( VIM <= 1.36645 )
								if( VIP_VIM <= -0.668227 )
									ret := -0.526316
								if( VIP_VIM > -0.668227 )
									ret := 0.073069
							if( VIM > 1.36645 )
								if( VIP <= 0.677185 )
									ret := -0.100000
								if( VIP > 0.677185 )
									ret := 0.440299
						if( VIP_VIM > -0.060044 )
							if( VIP_VIM <= -0.001603 )
								ret := 1.000000 // buy
							if( VIP_VIM > -0.001603 )
								ret := 0.727273 // buy
					if( mf > -0.543423 )
						if( VIM <= 1.11129 )
							if( ad_mf <= -1.81058e+06 )
								if( VIM <= 1.05331 )
									ret := 0.777778 // buy
								if( VIM > 1.05331 )
									ret := 0.000000
							if( ad_mf > -1.81058e+06 )
								if( VIP_VIM <= -0.230393 )
									ret := -0.344828
								if( VIP_VIM > -0.230393 )
									ret := -0.110680
						if( VIM > 1.11129 )
							if( VIM <= 1.11296 )
								ret := 0.631579
							if( VIM > 1.11296 )
								if( VIP <= 0.918122 )
									ret := 0.039102
								if( VIP > 0.918122 )
									ret := 0.264151
				if( VIP > 0.937578 )
					if( VIP_VIM <= -1.19707 )
						if( VIP_VIM <= -1.47923 )
							ret := 0.375000
						if( VIP_VIM > -1.47923 )
							if( VIP <= 1.00707 )
								ret := 0.000000
							if( VIP > 1.00707 )
								if( ad <= -278 )
									ret := -0.166667
								if( ad > -278 )
									ret := -0.500000
					if( VIP_VIM > -1.19707 )
						if( VIP_VIM <= -0.965538 )
							if( VIP_VIM <= -0.991391 )
								if( ad <= -1148.5 )
									ret := -0.272727
								if( ad > -1148.5 )
									ret := 0.500000
							if( VIP_VIM > -0.991391 )
								ret := 0.814815 // buy
						if( VIP_VIM > -0.965538 )
							if( VIM <= 1.82285 )
								if( VIM <= 1.80478 )
									ret := 0.156505
								if( VIM > 1.80478 )
									ret := 0.909091 // buy
							if( VIM > 1.82285 )
								if( mf <= -0.328254 )
									ret := 0.120879
								if( mf > -0.328254 )
									ret := -0.345679
			if( mf > -0.236249 )
				if( VIP_VIM <= 0.5269 )
					if( ad <= 2034.96 )
						if( ad_mf <= -606922 )
							if( ad <= -863652 )
								if( ad <= -1.42964e+06 )
									ret := 0.551724
								if( ad > -1.42964e+06 )
									ret := -0.051724
							if( ad > -863652 )
								if( ad <= -700800 )
									ret := -0.690000
								if( ad > -700800 )
									ret := -0.303571
						if( ad_mf > -606922 )
							if( VIM <= 1.49398 )
								if( ad <= -73635.2 )
									ret := 0.068186
								if( ad > -73635.2 )
									ret := -0.003353
							if( VIM > 1.49398 )
								if( mf <= -0.134454 )
									ret := 0.057065
								if( mf > -0.134454 )
									ret := 0.180818
					if( ad > 2034.96 )
						if( VIM <= 1.32799 )
							ret := 1.000000 // buy
						if( VIM > 1.32799 )
							ret := 0.923077 // buy
				if( VIP_VIM > 0.5269 )
					if( ad <= -257724 )
						if( ad <= -263199 )
							if( ad_mf <= -280188 )
								if( mf <= 0.438652 )
									ret := -0.389474
								if( mf > 0.438652 )
									ret := 0.600000
							if( ad_mf > -280188 )
								ret := 0.800000 // buy
						if( ad > -263199 )
							ret := -0.894737 // sell
					if( ad > -257724 )
						if( mf <= 0.074691 )
							if( mf <= -0.013959 )
								if( ad_mf <= -891.349 )
									ret := 0.390476
								if( ad_mf > -891.349 )
									ret := -0.023256
							if( mf > -0.013959 )
								if( ad_mf <= -135424 )
									ret := 0.217391
								if( ad_mf > -135424 )
									ret := 0.666667
						if( mf > 0.074691 )
							if( ad <= 461.02 )
								if( ad <= -245175 )
									ret := 0.923077 // buy
								if( ad > -245175 )
									ret := 0.151239
							if( ad > 461.02 )
								if( ad_mf <= 864.276 )
									ret := -0.628571
								if( ad_mf > 864.276 )
									ret := 0.020000
		if( VIP > 1.44865 )
			if( VIM <= 28.2938 )
				if( VIP_VIM <= -0.827512 )
					if( ad_mf <= 0.561742 )
						if( VIP_VIM <= -0.835983 )
							if( VIM <= 9.41312 )
								if( mf <= 0.018893 )
									ret := 0.223684
								if( mf > 0.018893 )
									ret := -0.038889
							if( VIM > 9.41312 )
								if( ad_mf <= -0.187474 )
									ret := 0.217391
								if( ad_mf > -0.187474 )
									ret := 0.853659 // buy
						if( VIP_VIM > -0.835983 )
							if( VIM <= 3.27299 )
								ret := 0.800000 // buy
							if( VIM > 3.27299 )
								ret := 0.117647
					if( ad_mf > 0.561742 )
						if( VIM <= 2.73659 )
							if( mf <= -0.157937 )
								if( VIP_VIM <= -0.967346 )
									ret := -0.733333 // sell
								if( VIP_VIM > -0.967346 )
									ret := -0.461538
							if( mf > -0.157937 )
								ret := 0.200000
						if( VIM > 2.73659 )
							if( mf <= -0.357897 )
								if( VIP_VIM <= -1.05603 )
									ret := -0.095238
								if( VIP_VIM > -1.05603 )
									ret := -0.571429
							if( mf > -0.357897 )
								if( VIM <= 2.96022 )
									ret := 0.833333 // buy
								if( VIM > 2.96022 )
									ret := 0.000000
				if( VIP_VIM > -0.827512 )
					if( ad_mf <= -10277.3 )
						if( ad_mf <= -13807.3 )
							if( ad_mf <= -188972 )
								ret := 0.272727
							if( ad_mf > -188972 )
								if( ad_mf <= -29495.9 )
									ret := -0.321429
								if( ad_mf > -29495.9 )
									ret := 0.157895
						if( ad_mf > -13807.3 )
							if( VIP_VIM <= 0.483979 )
								if( mf <= -0.199666 )
									ret := 0.789474 // buy
								if( mf > -0.199666 )
									ret := 1.000000 // buy
							if( VIP_VIM > 0.483979 )
								ret := 0.300000
					if( ad_mf > -10277.3 )
						if( ad <= -1125.28 )
							if( VIP_VIM <= -0.417509 )
								if( VIP <= 1.4953 )
									ret := 0.571429
								if( VIP > 1.4953 )
									ret := 0.078571
							if( VIP_VIM > -0.417509 )
								if( VIM <= 2.58207 )
									ret := -0.083629
								if( VIM > 2.58207 )
									ret := -0.324074
						if( ad > -1125.28 )
							if( ad <= -636.889 )
								if( VIM <= 2.07666 )
									ret := 0.159938
								if( VIM > 2.07666 )
									ret := -0.066362
							if( ad > -636.889 )
								if( VIM <= 0.815452 )
									ret := -0.268817
								if( VIM > 0.815452 )
									ret := -0.022676
			if( VIM > 28.2938 )
				if( VIM <= 57.4336 )
					if( VIP_VIM <= -1.42215 )
						ret := -0.333333
					if( VIP_VIM > -1.42215 )
						ret := -0.900000 // sell
				if( VIM > 57.4336 )
					if( VIM <= 68.103 )
						ret := -0.866667 // sell
					if( VIM > 68.103 )
						ret := -1.000000 // sell
	if( ad > 2056.2 )
		if( ad_mf <= 12098.8 )
			if( ad <= 11454.1 )
				if( VIM <= 1.57639 )
					if( mf <= 0.31436 )
						if( ad_mf <= 11116.6 )
							if( VIP <= 0.823913 )
								if( ad <= 10047.2 )
									ret := 0.122449
								if( ad > 10047.2 )
									ret := -0.480000
							if( VIP > 0.823913 )
								if( ad <= 2069.8 )
									ret := -0.833333 // sell
								if( ad > 2069.8 )
									ret := -0.132756
						if( ad_mf > 11116.6 )
							if( VIP <= 1.07311 )
								if( ad_mf <= 11372.4 )
									ret := 0.529412
								if( ad_mf > 11372.4 )
									ret := 0.857143 // buy
							if( VIP > 1.07311 )
								if( ad_mf <= 11278.5 )
									ret := 0.461538
								if( ad_mf > 11278.5 )
									ret := -0.636364
					if( mf > 0.31436 )
						if( VIP <= 1.283 )
							if( VIP <= 1.27109 )
								if( ad_mf <= 5548.98 )
									ret := -0.193460
								if( ad_mf > 5548.98 )
									ret := -0.564220
							if( VIP > 1.27109 )
								ret := -0.750000 // sell
						if( VIP > 1.283 )
							if( ad <= 2292.89 )
								if( ad <= 2112 )
									ret := 0.823529 // buy
								if( ad > 2112 )
									ret := 0.562500
							if( ad > 2292.89 )
								if( VIP_VIM <= 1.11515 )
									ret := -0.196078
								if( VIP_VIM > 1.11515 )
									ret := 0.296296
				if( VIM > 1.57639 )
					if( mf <= 0.189178 )
						if( ad_mf <= 2117.99 )
							if( VIP <= 1.04466 )
								ret := -0.875000 // sell
							if( VIP > 1.04466 )
								if( VIM <= 2.1034 )
									ret := 0.333333
								if( VIM > 2.1034 )
									ret := -0.642857
						if( ad_mf > 2117.99 )
							if( VIM <= 1.83889 )
								if( mf <= 0.065221 )
									ret := 0.012048
								if( mf > 0.065221 )
									ret := 0.442623
							if( VIM > 1.83889 )
								if( mf <= -0.443319 )
									ret := -0.142857
								if( mf > -0.443319 )
									ret := 0.351438
					if( mf > 0.189178 )
						if( mf <= 0.724125 )
							if( ad <= 2096.73 )
								if( ad <= 2088.72 )
									ret := 0.333333
								if( ad > 2088.72 )
									ret := 1.000000 // buy
							if( ad > 2096.73 )
								if( mf <= 0.636582 )
									ret := -0.234568
								if( mf > 0.636582 )
									ret := 0.615385
						if( mf > 0.724125 )
							if( mf <= 0.803979 )
								ret := -0.916667 // sell
							if( mf > 0.803979 )
								ret := -0.312500
			if( ad > 11454.1 )
				if( VIM <= 0.952169 )
					if( VIP <= 1.08188 )
						ret := 0.555556
					if( VIP > 1.08188 )
						if( VIP <= 1.16181 )
							if( VIP <= 1.13283 )
								ret := -0.416667
							if( VIP > 1.13283 )
								ret := -0.875000 // sell
						if( VIP > 1.16181 )
							if( ad_mf <= 11584.2 )
								ret := 0.333333
							if( ad_mf > 11584.2 )
								ret := -0.368421
				if( VIM > 0.952169 )
					if( ad <= 11751.5 )
						if( mf <= -0.157306 )
							if( ad <= 11729.4 )
								ret := -0.900000 // sell
							if( ad > 11729.4 )
								ret := -1.000000 // sell
						if( mf > -0.157306 )
							if( VIP_VIM <= -0.293721 )
								ret := -0.214286
							if( VIP_VIM > -0.293721 )
								if( mf <= 0.057181 )
									ret := -0.545455
								if( mf > 0.057181 )
									ret := -0.933333 // sell
					if( ad > 11751.5 )
						if( VIP_VIM <= -0.301427 )
							ret := 0.333333
						if( VIP_VIM > -0.301427 )
							if( ad <= 12067.3 )
								if( mf <= -0.015523 )
									ret := 0.363636
								if( mf > -0.015523 )
									ret := -0.533333
							if( ad > 12067.3 )
								ret := -1.000000 // sell
		if( ad_mf > 12098.8 )
			if( VIP <= 0.975874 )
				if( ad_mf <= 60212.7 )
					if( mf <= -0.367031 )
						if( VIP_VIM <= -0.313494 )
							if( VIM <= 1.191 )
								ret := 0.214286
							if( VIM > 1.191 )
								if( VIP <= 0.772362 )
									ret := -0.148148
								if( VIP > 0.772362 )
									ret := -0.727273 // sell
						if( VIP_VIM > -0.313494 )
							if( ad_mf <= 17994.7 )
								ret := -0.454545
							if( ad_mf > 17994.7 )
								if( VIM <= 1.08406 )
									ret := -0.600000
								if( VIM > 1.08406 )
									ret := -1.000000 // sell
					if( mf > -0.367031 )
						if( ad_mf <= 55710.9 )
							if( VIP <= 0.941888 )
								if( VIM <= 1.00778 )
									ret := -0.208696
								if( VIM > 1.00778 )
									ret := 0.113659
							if( VIP > 0.941888 )
								if( VIM <= 1.03835 )
									ret := 0.118721
								if( VIM > 1.03835 )
									ret := -0.179104
						if( ad_mf > 55710.9 )
							if( VIM <= 1.05 )
								if( VIM <= 0.968896 )
									ret := -1.000000 // sell
								if( VIM > 0.968896 )
									ret := 0.000000
							if( VIM > 1.05 )
								if( ad_mf <= 57943.6 )
									ret := 0.330645
								if( ad_mf > 57943.6 )
									ret := 0.743119 // buy
				if( ad_mf > 60212.7 )
					if( mf <= 0.693626 )
						if( VIP <= 0.642308 )
							if( VIP_VIM <= -0.744293 )
								if( mf <= -0.281102 )
									ret := -0.428571
								if( mf > -0.281102 )
									ret := 0.025641
							if( VIP_VIM > -0.744293 )
								if( VIP_VIM <= -0.69385 )
									ret := -0.694444
								if( VIP_VIM > -0.69385 )
									ret := -0.277778
						if( VIP > 0.642308 )
							if( ad_mf <= 60350.2 )
								ret := -0.913043 // sell
							if( ad_mf > 60350.2 )
								if( ad_mf <= 394702 )
									ret := 0.006479
								if( ad_mf > 394702 )
									ret := -0.142180
					if( mf > 0.693626 )
						if( ad <= 820167 )
							ret := 0.904762 // buy
						if( ad > 820167 )
							if( VIP_VIM <= -0.035121 )
								ret := -0.470588
							if( VIP_VIM > -0.035121 )
								if( VIM <= 0.837956 )
									ret := 0.529412
								if( VIM > 0.837956 )
									ret := 1.000000 // buy
			if( VIP > 0.975874 )
				if( VIP_VIM <= -0.081619 )
					if( ad_mf <= 14744.4 )
						ret := 0.750000 // buy
					if( ad_mf > 14744.4 )
						if( mf <= -0.143648 )
							if( VIM <= 1.09133 )
								ret := 0.400000
							if( VIM > 1.09133 )
								if( VIM <= 1.1845 )
									ret := -0.090909
								if( VIM > 1.1845 )
									ret := -0.600000
						if( mf > -0.143648 )
							if( ad_mf <= 53371.6 )
								if( VIM <= 1.0739 )
									ret := -0.920000 // sell
								if( VIM > 1.0739 )
									ret := -0.423077
							if( ad_mf > 53371.6 )
								if( ad_mf <= 121308 )
									ret := 0.066667
								if( ad_mf > 121308 )
									ret := -0.603448
				if( VIP_VIM > -0.081619 )
					if( ad <= 12598.6 )
						if( ad <= 12520.1 )
							if( mf <= 0.038943 )
								if( VIP_VIM <= 0.053102 )
									ret := -0.769231 // sell
								if( VIP_VIM > 0.053102 )
									ret := 0.727273 // buy
							if( mf > 0.038943 )
								if( VIP <= 1.04462 )
									ret := 1.000000 // buy
								if( VIP > 1.04462 )
									ret := 0.606061
						if( ad > 12520.1 )
							if( VIP_VIM <= 0.3599 )
								ret := 0.900000 // buy
							if( VIP_VIM > 0.3599 )
								ret := 0.857143 // buy
					if( ad > 12598.6 )
						if( ad_mf <= 222418 )
							if( ad <= 221324 )
								if( ad <= 220309 )
									ret := -0.034874
								if( ad > 220309 )
									ret := -0.857143 // sell
							if( ad > 221324 )
								if( VIP_VIM <= 0.100271 )
									ret := 1.000000 // buy
								if( VIP_VIM > 0.100271 )
									ret := 0.555556
						if( ad_mf > 222418 )
							if( ad <= 3.17066e+06 )
								if( VIM <= 1.01052 )
									ret := -0.142784
								if( VIM > 1.01052 )
									ret := 0.244898
							if( ad > 3.17066e+06 )
								if( VIP <= 1.11935 )
									ret := -0.379310
								if( VIP > 1.11935 )
									ret := -0.766667 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_MSFT_5Min_10eefbb4(mf, ad_mf, ad, VIP, VIP_VIM, VIM)

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


