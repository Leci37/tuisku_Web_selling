//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Vortex_Indicator
// ID_model: LYFT_1Min_2CV0_537fb300 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LYFT_1Min_2CV0_537fb300", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LYFT_1Min_537fb300(mf, ad_mf, ad, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ad <= 57.495 )
		if( VIP <= 3.67263 )
			if( VIP <= 1.05858 )
				if( VIM <= 1.45492 )
					if( mf <= 0.23558 )
						if( ad_mf <= -298903 )
							if( VIP <= 1.0276 )
								if( VIP_VIM <= -0.102706 )
									ret := 0.846154 // buy
								if( VIP_VIM > -0.102706 )
									ret := 0.500000
							if( VIP > 1.0276 )
								ret := 1.000000 // buy
						if( ad_mf > -298903 )
							if( mf <= -0.373514 )
								if( VIP_VIM <= -0.66446 )
									ret := 0.287805
								if( VIP_VIM > -0.66446 )
									ret := -0.120740
							if( mf > -0.373514 )
								if( VIP_VIM <= -0.340679 )
									ret := 0.090104
								if( VIP_VIM > -0.340679 )
									ret := 0.051160
					if( mf > 0.23558 )
						if( ad_mf <= -248.738 )
							if( mf <= 0.242744 )
								if( mf <= 0.238654 )
									ret := 0.181818
								if( mf > 0.238654 )
									ret := -0.435897
							if( mf > 0.242744 )
								if( VIM <= 1.34751 )
									ret := 0.039749
								if( VIM > 1.34751 )
									ret := 0.636364
						if( ad_mf > -248.738 )
							if( VIM <= 1.02532 )
								if( mf <= 0.284698 )
									ret := -0.723404 // sell
								if( mf > 0.284698 )
									ret := -0.410714
							if( VIM > 1.02532 )
								if( mf <= 0.380882 )
									ret := 0.054545
								if( mf > 0.380882 )
									ret := -0.338710
				if( VIM > 1.45492 )
					if( VIP <= 1.00166 )
						if( ad <= -18313.7 )
							if( VIP_VIM <= -1.06984 )
								ret := -0.583333
							if( VIP_VIM > -1.06984 )
								if( ad <= -80355 )
									ret := 0.571429
								if( ad > -80355 )
									ret := 0.000000
						if( ad > -18313.7 )
							if( ad_mf <= 0.247736 )
								if( VIP <= 0.94514 )
									ret := 0.251553
								if( VIP > 0.94514 )
									ret := 0.701149 // buy
							if( ad_mf > 0.247736 )
								if( VIM <= 1.86661 )
									ret := 0.560440
								if( VIM > 1.86661 )
									ret := 0.911111 // buy
					if( VIP > 1.00166 )
						if( mf <= 0.040766 )
							if( VIP <= 1.00894 )
								ret := -0.916667 // sell
							if( VIP > 1.00894 )
								if( ad <= -3668.43 )
									ret := -0.441176
								if( ad > -3668.43 )
									ret := 0.047619
						if( mf > 0.040766 )
							ret := 0.642857
			if( VIP > 1.05858 )
				if( VIM <= 1.58328 )
					if( ad_mf <= -0.089901 )
						if( ad <= -60170.5 )
							if( ad <= -228252 )
								if( ad <= -245918 )
									ret := 0.163265
								if( ad > -245918 )
									ret := 0.900000 // buy
							if( ad > -228252 )
								if( ad <= -61013.8 )
									ret := -0.234139
								if( ad > -61013.8 )
									ret := -1.000000 // sell
						if( ad > -60170.5 )
							if( mf <= 0.325216 )
								if( VIM <= 1.17299 )
									ret := -0.000275
								if( VIM > 1.17299 )
									ret := 0.135609
							if( mf > 0.325216 )
								if( ad <= -33708 )
									ret := -0.721311 // sell
								if( ad > -33708 )
									ret := -0.093656
					if( ad_mf > -0.089901 )
						if( mf <= 0.042992 )
							if( VIP_VIM <= -0.279158 )
								if( VIP_VIM <= -0.322121 )
									ret := -0.277778
								if( VIP_VIM > -0.322121 )
									ret := -0.863636 // sell
							if( VIP_VIM > -0.279158 )
								if( ad_mf <= 0.162941 )
									ret := -0.139197
								if( ad_mf > 0.162941 )
									ret := 0.005245
						if( mf > 0.042992 )
							if( ad_mf <= 36.8237 )
								if( ad_mf <= -0.05627 )
									ret := -0.382353
								if( ad_mf > -0.05627 )
									ret := -0.226562
							if( ad_mf > 36.8237 )
								ret := 0.470588
				if( VIM > 1.58328 )
					if( ad_mf <= -1099.53 )
						if( ad <= -2199.39 )
							if( ad <= -2655.2 )
								if( VIP_VIM <= -0.722254 )
									ret := 0.645570
								if( VIP_VIM > -0.722254 )
									ret := 0.168790
							if( ad > -2655.2 )
								if( mf <= 0.154045 )
									ret := -0.507937
								if( mf > 0.154045 )
									ret := 0.583333
						if( ad > -2199.39 )
							if( VIP_VIM <= -0.8163 )
								ret := -0.368421
							if( VIP_VIM > -0.8163 )
								if( ad_mf <= -1972.78 )
									ret := 0.770270 // buy
								if( ad_mf > -1972.78 )
									ret := 0.443366
					if( ad_mf > -1099.53 )
						if( VIP_VIM <= -0.420442 )
							if( mf <= -0.520552 )
								if( VIM <= 3.82434 )
									ret := -0.563636
								if( VIM > 3.82434 )
									ret := 0.615385
							if( mf > -0.520552 )
								if( ad_mf <= -0.743826 )
									ret := 0.493151
								if( ad_mf > -0.743826 )
									ret := 0.116737
						if( VIP_VIM > -0.420442 )
							if( ad_mf <= 0.736665 )
								if( VIM <= 1.66288 )
									ret := 0.218750
								if( VIM > 1.66288 )
									ret := -0.042052
							if( ad_mf > 0.736665 )
								if( VIP <= 2.01654 )
									ret := 1.000000 // buy
								if( VIP > 2.01654 )
									ret := 0.800000 // buy
		if( VIP > 3.67263 )
			if( VIP <= 173.5 )
				if( VIP <= 4.15494 )
					if( mf <= -0.565736 )
						ret := -0.666667
					if( mf > -0.565736 )
						if( VIP <= 4.01538 )
							if( mf <= 0.407265 )
								if( VIP_VIM <= 0.326167 )
									ret := 0.416107
								if( VIP_VIM > 0.326167 )
									ret := 0.127907
							if( mf > 0.407265 )
								if( ad_mf <= -0.428497 )
									ret := 0.027027
								if( ad_mf > -0.428497 )
									ret := -0.900000 // sell
						if( VIP > 4.01538 )
							if( ad_mf <= 0.124523 )
								if( VIP_VIM <= -0.410408 )
									ret := 0.870370 // buy
								if( VIP_VIM > -0.410408 )
									ret := 0.596154
							if( ad_mf > 0.124523 )
								ret := 0.117647
				if( VIP > 4.15494 )
					if( ad_mf <= -290.771 )
						if( ad <= -1668.4 )
							if( VIP <= 4.4533 )
								ret := 0.550000
							if( VIP > 4.4533 )
								if( ad_mf <= -2220.1 )
									ret := 0.163636
								if( ad_mf > -2220.1 )
									ret := -0.500000
						if( ad > -1668.4 )
							if( VIM <= 9.59026 )
								if( VIP_VIM <= -0.969754 )
									ret := 0.312500
								if( VIP_VIM > -0.969754 )
									ret := 0.685393
							if( VIM > 9.59026 )
								if( VIM <= 11.1294 )
									ret := -0.300000
								if( VIM > 11.1294 )
									ret := 0.142857
					if( ad_mf > -290.771 )
						if( VIM <= 3.63964 )
							if( VIP <= 4.72659 )
								if( VIP_VIM <= 1.63895 )
									ret := -0.177778
								if( VIP_VIM > 1.63895 )
									ret := 0.407407
							if( VIP > 4.72659 )
								if( VIM <= 2.97112 )
									ret := -0.809524 // sell
								if( VIM > 2.97112 )
									ret := -0.360656
						if( VIM > 3.63964 )
							if( ad_mf <= 0.030268 )
								if( ad <= -100 )
									ret := -0.583333
								if( ad > -100 )
									ret := 0.115369
							if( ad_mf > 0.030268 )
								if( VIP <= 4.41081 )
									ret := -0.303571
								if( VIP > 4.41081 )
									ret := 0.216092
			if( VIP > 173.5 )
				if( mf <= 0.201864 )
					if( ad_mf <= -0.071825 )
						if( VIM <= 1115.43 )
							if( mf <= 0.157799 )
								if( VIM <= 223.809 )
									ret := -1.000000 // sell
								if( VIM > 223.809 )
									ret := -0.740741 // sell
							if( mf > 0.157799 )
								ret := -0.444444
						if( VIM > 1115.43 )
							ret := 0.076923
					if( ad_mf > -0.071825 )
						if( VIP <= 195.517 )
							ret := -0.470588
						if( VIP > 195.517 )
							if( mf <= -0.108549 )
								if( VIM <= 1456.5 )
									ret := -0.387097
								if( VIM > 1456.5 )
									ret := 0.071429
							if( mf > -0.108549 )
								if( mf <= -0.05733 )
									ret := 0.357143
								if( mf > -0.05733 )
									ret := -0.081633
				if( mf > 0.201864 )
					ret := 0.714286 // buy
	if( ad > 57.495 )
		if( VIP <= 1.39978 )
			if( ad_mf <= 4138.53 )
				if( ad <= 3927.75 )
					if( ad_mf <= 3901.21 )
						if( ad <= 3840.33 )
							if( VIM <= 1.81758 )
								if( ad_mf <= 3704.36 )
									ret := -0.125421
								if( ad_mf > 3704.36 )
									ret := 0.214660
							if( VIM > 1.81758 )
								if( VIP_VIM <= -0.635829 )
									ret := 0.552632
								if( VIP_VIM > -0.635829 )
									ret := 0.100000
						if( ad > 3840.33 )
							if( VIP_VIM <= -0.062581 )
								if( VIP_VIM <= -0.255586 )
									ret := -0.454545
								if( VIP_VIM > -0.255586 )
									ret := 0.000000
							if( VIP_VIM > -0.062581 )
								if( VIP <= 1.09023 )
									ret := -0.850000 // sell
								if( VIP > 1.09023 )
									ret := -0.375000
					if( ad_mf > 3901.21 )
						if( mf <= -0.002798 )
							ret := -0.363636
						if( mf > -0.002798 )
							if( mf <= 0.075205 )
								ret := 0.533333
							if( mf > 0.075205 )
								if( mf <= 0.246858 )
									ret := 1.000000 // buy
								if( mf > 0.246858 )
									ret := 0.777778 // buy
				if( ad > 3927.75 )
					if( VIM <= 1.15563 )
						if( mf <= 0.245531 )
							if( ad_mf <= 4022.37 )
								if( VIP_VIM <= 0.451844 )
									ret := -0.677778
								if( VIP_VIM > 0.451844 )
									ret := -0.375000
							if( ad_mf > 4022.37 )
								if( ad_mf <= 4080.44 )
									ret := -0.118644
								if( ad_mf > 4080.44 )
									ret := -0.476190
						if( mf > 0.245531 )
							if( ad <= 3983 )
								ret := 0.600000
							if( ad > 3983 )
								if( VIP <= 1.13431 )
									ret := 0.400000
								if( VIP > 1.13431 )
									ret := -0.695652
					if( VIM > 1.15563 )
						if( ad_mf <= 4076.91 )
							if( mf <= -0.16284 )
								ret := 0.105263
							if( mf > -0.16284 )
								if( VIP_VIM <= -0.408359 )
									ret := -0.818182 // sell
								if( VIP_VIM > -0.408359 )
									ret := -0.250000
						if( ad_mf > 4076.91 )
							ret := 0.500000
			if( ad_mf > 4138.53 )
				if( mf <= 0.185245 )
					if( ad <= 32044.2 )
						if( mf <= -0.122908 )
							if( ad <= 11727 )
								if( VIM <= 1.3906 )
									ret := -0.048806
								if( VIM > 1.3906 )
									ret := 0.348624
							if( ad > 11727 )
								if( ad_mf <= 11913 )
									ret := -0.698113
								if( ad_mf > 11913 )
									ret := -0.129863
						if( mf > -0.122908 )
							if( ad <= 16727.8 )
								if( ad_mf <= 5170.21 )
									ret := 0.146162
								if( ad_mf > 5170.21 )
									ret := 0.015960
							if( ad > 16727.8 )
								if( ad <= 17678.3 )
									ret := -0.395664
								if( ad > 17678.3 )
									ret := -0.081737
					if( ad > 32044.2 )
						if( VIP_VIM <= 0.556169 )
							if( VIP <= 0.914373 )
								if( mf <= 0.09476 )
									ret := 0.017857
								if( mf > 0.09476 )
									ret := -0.385714
							if( VIP > 0.914373 )
								if( ad_mf <= 36213.3 )
									ret := 0.336134
								if( ad_mf > 36213.3 )
									ret := 0.081783
						if( VIP_VIM > 0.556169 )
							if( ad <= 127620 )
								if( ad_mf <= 82219 )
									ret := -0.341772
								if( ad_mf > 82219 )
									ret := 0.214286
							if( ad > 127620 )
								ret := -1.000000 // sell
				if( mf > 0.185245 )
					if( ad <= 137342 )
						if( VIM <= 1.3347 )
							if( VIP <= 1.043 )
								if( VIP_VIM <= 0.097349 )
									ret := -0.035358
								if( VIP_VIM > 0.097349 )
									ret := 0.284091
							if( VIP > 1.043 )
								if( mf <= 0.533132 )
									ret := -0.091263
								if( mf > 0.533132 )
									ret := 0.389831
						if( VIM > 1.3347 )
							if( ad_mf <= 12944.8 )
								if( mf <= 0.382486 )
									ret := 0.937500 // buy
								if( mf > 0.382486 )
									ret := 0.416667
							if( ad_mf > 12944.8 )
								ret := 0.000000
					if( ad > 137342 )
						if( mf <= 0.718789 )
							if( ad <= 374309 )
								if( mf <= 0.340582 )
									ret := -0.404040
								if( mf > 0.340582 )
									ret := -0.148148
							if( ad > 374309 )
								if( VIM <= 0.816251 )
									ret := -0.692308
								if( VIM > 0.816251 )
									ret := -0.941176 // sell
						if( mf > 0.718789 )
							ret := 0.647059
		if( VIP > 1.39978 )
			if( ad_mf <= 13748.1 )
				if( VIM <= 2.82889 )
					if( ad_mf <= 12552.7 )
						if( ad <= 249.437 )
							if( VIP_VIM <= 0.134787 )
								ret := -0.285714
							if( VIP_VIM > 0.134787 )
								if( ad <= 208.119 )
									ret := 0.923077 // buy
								if( ad > 208.119 )
									ret := 0.666667
						if( ad > 249.437 )
							if( ad_mf <= 300 )
								if( mf <= 0.37528 )
									ret := -0.888889 // sell
								if( mf > 0.37528 )
									ret := -0.250000
							if( ad_mf > 300 )
								if( VIP_VIM <= 1.06914 )
									ret := -0.304886
								if( VIP_VIM > 1.06914 )
									ret := -0.670886
					if( ad_mf > 12552.7 )
						if( ad <= 13266.7 )
							ret := 0.300000
						if( ad > 13266.7 )
							ret := 0.882353 // buy
				if( VIM > 2.82889 )
					if( ad_mf <= 850.052 )
						if( mf <= -0.04115 )
							if( VIP_VIM <= 0.116226 )
								if( ad_mf <= 394.014 )
									ret := -0.500000
								if( ad_mf > 394.014 )
									ret := -0.136364
							if( VIP_VIM > 0.116226 )
								if( ad_mf <= 391.56 )
									ret := 0.166667
								if( ad_mf > 391.56 )
									ret := 0.615385
						if( mf > -0.04115 )
							if( mf <= 0.083382 )
								if( ad <= 610.226 )
									ret := -0.616438
								if( ad > 610.226 )
									ret := -1.000000 // sell
							if( mf > 0.083382 )
								if( VIP <= 3.97749 )
									ret := -0.636364
								if( VIP > 3.97749 )
									ret := -0.234043
					if( ad_mf > 850.052 )
						if( ad <= 910.97 )
							if( ad_mf <= 887.433 )
								ret := 0.625000
							if( ad_mf > 887.433 )
								ret := 0.928571 // buy
						if( ad > 910.97 )
							if( ad_mf <= 1280.59 )
								if( mf <= 0.168401 )
									ret := -0.389381
								if( mf > 0.168401 )
									ret := 0.075000
							if( ad_mf > 1280.59 )
								if( ad <= 1500.5 )
									ret := 0.580645
								if( ad > 1500.5 )
									ret := -0.038356
			if( ad_mf > 13748.1 )
				if( VIM <= 1.83546 )
					if( VIP_VIM <= 0.828748 )
						if( mf <= 0.317425 )
							if( ad <= 14459.5 )
								ret := -1.000000 // sell
							if( ad > 14459.5 )
								if( ad_mf <= 15608.4 )
									ret := 1.000000 // buy
								if( ad_mf > 15608.4 )
									ret := -0.538462
						if( mf > 0.317425 )
							if( ad <= 89419.7 )
								if( ad <= 51554.3 )
									ret := -0.796610 // sell
								if( ad > 51554.3 )
									ret := -0.428571
							if( ad > 89419.7 )
								ret := -1.000000 // sell
					if( VIP_VIM > 0.828748 )
						if( VIP <= 1.95287 )
							if( VIM <= 0.51275 )
								if( ad_mf <= 49295.8 )
									ret := -0.500000
								if( ad_mf > 49295.8 )
									ret := -0.882353 // sell
							if( VIM > 0.51275 )
								if( VIM <= 0.794285 )
									ret := -0.272727
								if( VIM > 0.794285 )
									ret := 0.400000
						if( VIP > 1.95287 )
							ret := 0.500000
				if( VIM > 1.83546 )
					if( VIP_VIM <= -0.318317 )
						if( ad_mf <= 54314.6 )
							if( ad <= 22229.6 )
								ret := -0.714286 // sell
							if( ad > 22229.6 )
								ret := 0.222222
						if( ad_mf > 54314.6 )
							ret := -1.000000 // sell
					if( VIP_VIM > -0.318317 )
						if( ad <= 35682.7 )
							if( ad <= 14469.8 )
								ret := -1.000000 // sell
							if( ad > 14469.8 )
								ret := -0.500000
						if( ad > 35682.7 )
							if( VIP_VIM <= 0.267979 )
								ret := -1.000000 // sell
							if( VIP_VIM > 0.267979 )
								ret := -0.900000 // sell
	
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
float op_operation = decision_tree_0_LYFT_1Min_537fb300(mf, ad_mf, ad, VIP, VIP_VIM, VIM)

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


