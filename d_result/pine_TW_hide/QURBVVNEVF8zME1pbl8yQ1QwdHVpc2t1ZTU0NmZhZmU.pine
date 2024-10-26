//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: ADAUSDT_30Min_2CT0_e546fafe Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADAUSDT_30Min_2CT0_e546fafe", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADAUSDT_30Min_e546fafe(ad, mf, ad_mf, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ad <= -5.91409e+06 )
		if( ema13 <= 0.001708 )
			if( ad <= -2.13568e+07 )
				if( ema13 <= -0.05221 )
					if( ad_mf <= -2.78896e+07 )
						if( mf <= -0.227816 )
							ret := -0.076923
						if( mf > -0.227816 )
							if( ad_mf <= -4.12512e+07 )
								ret := -0.230769
							if( ad_mf > -4.12512e+07 )
								if( ema2 <= 1.29383 )
									ret := 0.923077 // buy
								if( ema2 > 1.29383 )
									ret := 1.000000 // buy
					if( ad_mf > -2.78896e+07 )
						if( mf <= -0.078705 )
							ret := 0.333333
						if( mf > -0.078705 )
							ret := -1.000000 // sell
				if( ema13 > -0.05221 )
					if( ad_mf <= -2.41842e+07 )
						if( mf <= 0.064956 )
							if( ad_mf <= -2.5744e+07 )
								if( ema2 <= 0.282638 )
									ret := 0.609756
								if( ema2 > 0.282638 )
									ret := 0.927928 // buy
							if( ad_mf > -2.5744e+07 )
								ret := -0.230769
						if( mf > 0.064956 )
							if( tema <= 0.759854 )
								ret := -1.000000 // sell
							if( tema > 0.759854 )
								ret := 0.000000
					if( ad_mf > -2.41842e+07 )
						if( ema3 <= 1.5046 )
							if( ema12 <= -0.003631 )
								ret := 1.000000 // buy
							if( ema12 > -0.003631 )
								ret := 0.823529 // buy
						if( ema3 > 1.5046 )
							ret := 0.833333 // buy
			if( ad > -2.13568e+07 )
				if( ema12 <= -0.050266 )
					if( ema12 <= -0.056719 )
						ret := 1.000000 // buy
					if( ema12 > -0.056719 )
						ret := 0.636364
				if( ema12 > -0.050266 )
					if( ad <= -1.30342e+07 )
						if( tema <= 0.433057 )
							if( ad_mf <= -2.03035e+07 )
								ret := 0.947368 // buy
							if( ad_mf > -2.03035e+07 )
								if( ema2 <= 0.136837 )
									ret := -0.357143
								if( ema2 > 0.136837 )
									ret := 0.355556
						if( tema > 0.433057 )
							if( ema2 <= 0.868222 )
								if( mf <= 0.049716 )
									ret := -0.331034
								if( mf > 0.049716 )
									ret := -0.857143 // sell
							if( ema2 > 0.868222 )
								if( ema2 <= 1.68664 )
									ret := 0.045296
								if( ema2 > 1.68664 )
									ret := -0.500000
					if( ad > -1.30342e+07 )
						if( ad_mf <= -9.76075e+06 )
							if( ema1 <= 2.00013 )
								if( ad_mf <= -1.07796e+07 )
									ret := 0.309927
								if( ad_mf > -1.07796e+07 )
									ret := 0.556701
							if( ema1 > 2.00013 )
								ret := -0.350000
						if( ad_mf > -9.76075e+06 )
							if( ema1 <= 2.15833 )
								if( ad_mf <= -6.33002e+06 )
									ret := 0.147780
								if( ad_mf > -6.33002e+06 )
									ret := 0.427928
							if( ema1 > 2.15833 )
								if( tema <= 2.37035 )
									ret := -0.103448
								if( tema > 2.37035 )
									ret := -0.416667
		if( ema13 > 0.001708 )
			if( ema2 <= 0.23156 )
				if( ad_mf <= -1.09365e+07 )
					if( ad_mf <= -1.44901e+07 )
						if( tema <= 0.17337 )
							if( mf <= 0.154917 )
								if( ema1 <= 0.136414 )
									ret := -0.727273 // sell
								if( ema1 > 0.136414 )
									ret := 0.307692
							if( mf > 0.154917 )
								ret := 0.615385
						if( tema > 0.17337 )
							if( ema2 <= 0.203274 )
								if( ema13 <= 0.002624 )
									ret := -1.000000 // sell
								if( ema13 > 0.002624 )
									ret := -0.130435
							if( ema2 > 0.203274 )
								ret := -0.900000 // sell
					if( ad_mf > -1.44901e+07 )
						if( mf <= 0.105411 )
							if( ema3 <= 0.149882 )
								ret := 1.000000 // buy
							if( ema3 > 0.149882 )
								ret := 0.888889 // buy
						if( mf > 0.105411 )
							ret := 0.545455
				if( ad_mf > -1.09365e+07 )
					if( ema3 <= 0.19832 )
						if( mf <= 0.052661 )
							if( tema <= 0.158443 )
								ret := -1.000000 // sell
							if( tema > 0.158443 )
								ret := -0.800000 // sell
						if( mf > 0.052661 )
							if( ad <= -9.5218e+06 )
								ret := -0.750000 // sell
							if( ad > -9.5218e+06 )
								if( ad_mf <= -7.85828e+06 )
									ret := 0.280000
								if( ad_mf > -7.85828e+06 )
									ret := -0.261905
					if( ema3 > 0.19832 )
						ret := -1.000000 // sell
			if( ema2 > 0.23156 )
				if( ema12 <= 0.009787 )
					if( ema13 <= 0.002652 )
						if( tema <= 0.449688 )
							if( tema <= 0.389561 )
								if( ema13 <= 0.001951 )
									ret := 0.555556
								if( ema13 > 0.001951 )
									ret := -0.440000
							if( tema > 0.389561 )
								ret := 0.846154 // buy
						if( tema > 0.449688 )
							if( mf <= -0.02787 )
								ret := 0.466667
							if( mf > -0.02787 )
								if( ema3 <= 0.51994 )
									ret := -0.750000 // sell
								if( ema3 > 0.51994 )
									ret := -0.433962
					if( ema13 > 0.002652 )
						if( ad <= -1.10252e+07 )
							if( ad <= -1.24391e+07 )
								if( ema12 <= -0.000593 )
									ret := 0.769231 // buy
								if( ema12 > -0.000593 )
									ret := 0.272059
							if( ad > -1.24391e+07 )
								if( ema12 <= 0.007997 )
									ret := 0.805369 // buy
								if( ema12 > 0.007997 )
									ret := 0.275862
						if( ad > -1.10252e+07 )
							if( ema3 <= 2.08556 )
								if( ema12 <= 0.000494 )
									ret := 0.741935 // buy
								if( ema12 > 0.000494 )
									ret := 0.053968
							if( ema3 > 2.08556 )
								if( ad_mf <= -6.82963e+06 )
									ret := 0.882353 // buy
								if( ad_mf > -6.82963e+06 )
									ret := 0.384615
				if( ema12 > 0.009787 )
					if( tema <= 1.62575 )
						if( ad <= -7.53266e+06 )
							if( ad_mf <= -8.1309e+06 )
								if( ema13 <= 0.013987 )
									ret := -0.884615 // sell
								if( ema13 > 0.013987 )
									ret := -0.081395
							if( ad_mf > -8.1309e+06 )
								if( ema2 <= 0.906453 )
									ret := -0.818182 // sell
								if( ema2 > 0.906453 )
									ret := -1.000000 // sell
						if( ad > -7.53266e+06 )
							if( ema12 <= 0.016884 )
								if( ad_mf <= -7.42014e+06 )
									ret := 1.000000 // buy
								if( ad_mf > -7.42014e+06 )
									ret := 0.111111
							if( ema12 > 0.016884 )
								if( ema13 <= 0.039425 )
									ret := 0.687500
								if( ema13 > 0.039425 )
									ret := 1.000000 // buy
					if( tema > 1.62575 )
						if( mf <= -0.059845 )
							ret := -0.875000 // sell
						if( mf > -0.059845 )
							if( ad_mf <= -2.16992e+07 )
								if( ema12 <= 0.037407 )
									ret := 0.437500
								if( ema12 > 0.037407 )
									ret := -1.000000 // sell
							if( ad_mf > -2.16992e+07 )
								if( ema12 <= 0.028542 )
									ret := 0.089041
								if( ema12 > 0.028542 )
									ret := 0.632184
	if( ad > -5.91409e+06 )
		if( ema1 <= 1.32367 )
			if( ema12 <= 0.014015 )
				if( ad <= 8.67218e+06 )
					if( ad <= -1.91517e+06 )
						if( ad <= -1.93618e+06 )
							if( ema12 <= -0.002242 )
								if( tema <= 0.613637 )
									ret := 0.270799
								if( tema > 0.613637 )
									ret := 0.050158
							if( ema12 > -0.002242 )
								if( ema2 <= 1.23072 )
									ret := 0.011934
								if( ema2 > 1.23072 )
									ret := 0.127090
						if( ad > -1.93618e+06 )
							if( ema1 <= 0.851386 )
								if( ad_mf <= -1.9193e+06 )
									ret := 0.644860
								if( ad_mf > -1.9193e+06 )
									ret := 0.250000
							if( ema1 > 0.851386 )
								if( ema2 <= 0.982129 )
									ret := -0.692308
								if( ema2 > 0.982129 )
									ret := 0.608696
					if( ad > -1.91517e+06 )
						if( ema1 <= 0.461466 )
							if( ad <= 8.42796e+06 )
								if( ema1 <= 0.088736 )
									ret := 0.387755
								if( ema1 > 0.088736 )
									ret := 0.003079
							if( ad > 8.42796e+06 )
								if( tema <= 0.321235 )
									ret := -0.309524
								if( tema > 0.321235 )
									ret := -0.880952 // sell
						if( ema1 > 0.461466 )
							if( ema13 <= 0.002035 )
								if( ad <= -1.39097e+06 )
									ret := -0.208226
								if( ad > -1.39097e+06 )
									ret := -0.041335
							if( ema13 > 0.002035 )
								if( ema13 <= 0.005314 )
									ret := 0.048374
								if( ema13 > 0.005314 )
									ret := -0.019168
				if( ad > 8.67218e+06 )
					if( ad <= 2.10312e+07 )
						if( ad <= 2.03671e+07 )
							if( ad <= 8.76364e+06 )
								if( ema13 <= -0.001842 )
									ret := 1.000000 // buy
								if( ema13 > -0.001842 )
									ret := 0.354839
							if( ad > 8.76364e+06 )
								if( mf <= 0.276391 )
									ret := 0.165610
								if( mf > 0.276391 )
									ret := -0.126984
						if( ad > 2.03671e+07 )
							if( tema <= 0.596635 )
								if( ema13 <= 0.000549 )
									ret := 0.818182 // buy
								if( ema13 > 0.000549 )
									ret := 0.600000
							if( tema > 0.596635 )
								if( ema13 <= -0.027136 )
									ret := 0.818182 // buy
								if( ema13 > -0.027136 )
									ret := 1.000000 // buy
					if( ad > 2.10312e+07 )
						if( ema13 <= -0.009566 )
							if( ema12 <= -0.012749 )
								if( ad <= 2.55928e+07 )
									ret := 0.416667
								if( ad > 2.55928e+07 )
									ret := -0.153846
							if( ema12 > -0.012749 )
								if( ad_mf <= 2.97728e+07 )
									ret := 0.086957
								if( ad_mf > 2.97728e+07 )
									ret := 0.854167 // buy
						if( ema13 > -0.009566 )
							if( tema <= 0.961138 )
								if( ema12 <= 0.006511 )
									ret := -0.016835
								if( ema12 > 0.006511 )
									ret := -0.350993
							if( tema > 0.961138 )
								if( ema3 <= 0.996603 )
									ret := -1.000000 // sell
								if( ema3 > 0.996603 )
									ret := -0.492308
			if( ema12 > 0.014015 )
				if( ad <= 1.55982e+07 )
					if( ema3 <= 1.0097 )
						if( ad <= 1.29007e+07 )
							if( ad <= 1.89566e+06 )
								if( ad <= -1.64267e+06 )
									ret := -0.500000
								if( ad > -1.64267e+06 )
									ret := 0.162791
							if( ad > 1.89566e+06 )
								if( ad_mf <= 2.09692e+06 )
									ret := -1.000000 // sell
								if( ad_mf > 2.09692e+06 )
									ret := -0.447619
						if( ad > 1.29007e+07 )
							ret := 0.333333
					if( ema3 > 1.0097 )
						if( mf <= 0.236963 )
							if( ema1 <= 1.17132 )
								if( ad_mf <= -376071 )
									ret := -0.333333
								if( ad_mf > -376071 )
									ret := 0.443299
							if( ema1 > 1.17132 )
								if( ema2 <= 1.28732 )
									ret := -0.041667
								if( ema2 > 1.28732 )
									ret := -0.523810
						if( mf > 0.236963 )
							if( ema2 <= 1.22362 )
								if( ema13 <= 0.027145 )
									ret := -0.222222
								if( ema13 > 0.027145 )
									ret := -0.857143 // sell
							if( ema2 > 1.22362 )
								if( ema12 <= 0.023802 )
									ret := -0.257143
								if( ema12 > 0.023802 )
									ret := 0.437500
				if( ad > 1.55982e+07 )
					if( ema3 <= 0.912383 )
						if( ema13 <= 0.028808 )
							if( ema1 <= 0.65795 )
								ret := -0.714286 // sell
							if( ema1 > 0.65795 )
								ret := -0.266667
						if( ema13 > 0.028808 )
							if( ad_mf <= 3.22749e+07 )
								if( ad_mf <= 2.42662e+07 )
									ret := -0.944444 // sell
								if( ad_mf > 2.42662e+07 )
									ret := -1.000000 // sell
							if( ad_mf > 3.22749e+07 )
								if( tema <= 0.637234 )
									ret := -0.600000
								if( tema > 0.637234 )
									ret := -0.863636 // sell
					if( ema3 > 0.912383 )
						if( ema3 <= 1.13133 )
							if( ad_mf <= 1.85007e+07 )
								if( ad <= 1.74755e+07 )
									ret := -0.375000
								if( ad > 1.74755e+07 )
									ret := -1.000000 // sell
							if( ad_mf > 1.85007e+07 )
								if( ema2 <= 1.04694 )
									ret := -0.307692
								if( ema2 > 1.04694 )
									ret := 0.235294
						if( ema3 > 1.13133 )
							if( ema12 <= 0.021814 )
								if( ema12 <= 0.018131 )
									ret := -0.750000 // sell
								if( ema12 > 0.018131 )
									ret := -0.095238
							if( ema12 > 0.021814 )
								if( ad <= 2.52933e+07 )
									ret := -0.966667 // sell
								if( ad > 2.52933e+07 )
									ret := -0.600000
		if( ema1 > 1.32367 )
			if( ema13 <= -0.018596 )
				if( tema <= 1.45766 )
					if( ema3 <= 1.47921 )
						if( ad <= 1.46313e+07 )
							if( ema12 <= -0.02689 )
								ret := 0.769231 // buy
							if( ema12 > -0.02689 )
								if( ema12 <= -0.01283 )
									ret := -0.014184
								if( ema12 > -0.01283 )
									ret := 0.246479
						if( ad > 1.46313e+07 )
							if( ema13 <= -0.035597 )
								ret := -0.818182 // sell
							if( ema13 > -0.035597 )
								ret := 0.125000
					if( ema3 > 1.47921 )
						if( mf <= -0.135799 )
							ret := -0.083333
						if( mf > -0.135799 )
							if( tema <= 1.44456 )
								if( ema3 <= 1.52222 )
									ret := 0.878788 // buy
								if( ema3 > 1.52222 )
									ret := 0.500000
							if( tema > 1.44456 )
								if( mf <= 0.050789 )
									ret := 0.590909
								if( mf > 0.050789 )
									ret := 0.000000
				if( tema > 1.45766 )
					if( mf <= -0.015158 )
						if( ema12 <= -0.010223 )
							if( tema <= 1.47302 )
								ret := -0.750000 // sell
							if( tema > 1.47302 )
								if( ema12 <= -0.050524 )
									ret := 0.789474 // buy
								if( ema12 > -0.050524 )
									ret := 0.141901
						if( ema12 > -0.010223 )
							if( ema2 <= 1.58065 )
								if( ema3 <= 1.54499 )
									ret := 0.272727
								if( ema3 > 1.54499 )
									ret := 1.000000 // buy
							if( ema2 > 1.58065 )
								if( mf <= -0.072564 )
									ret := -0.684211
								if( mf > -0.072564 )
									ret := -0.100000
					if( mf > -0.015158 )
						if( ema3 <= 1.56331 )
							if( ema1 <= 1.47982 )
								ret := 0.125000
							if( ema1 > 1.47982 )
								if( ema3 <= 1.54133 )
									ret := -0.700000 // sell
								if( ema3 > 1.54133 )
									ret := -1.000000 // sell
						if( ema3 > 1.56331 )
							if( ema12 <= -0.014532 )
								if( mf <= 0.085392 )
									ret := -0.079051
								if( mf > 0.085392 )
									ret := 0.286713
							if( ema12 > -0.014532 )
								if( ema1 <= 1.73584 )
									ret := -0.387387
								if( ema1 > 1.73584 )
									ret := -0.095506
			if( ema13 > -0.018596 )
				if( ad_mf <= 2.50345e+07 )
					if( ema2 <= 1.93004 )
						if( ad_mf <= 2.05185e+07 )
							if( ema12 <= -0.011391 )
								if( ema3 <= 1.49682 )
									ret := 0.066667
								if( ema3 > 1.49682 )
									ret := 0.781250 // buy
							if( ema12 > -0.011391 )
								if( ema13 <= -0.006858 )
									ret := -0.195460
								if( ema13 > -0.006858 )
									ret := -0.106293
						if( ad_mf > 2.05185e+07 )
							if( mf <= 0.119698 )
								ret := -0.176471
							if( mf > 0.119698 )
								if( ema13 <= 0.031362 )
									ret := 1.000000 // buy
								if( ema13 > 0.031362 )
									ret := 0.052632
					if( ema2 > 1.93004 )
						if( ad_mf <= 5.55107e+06 )
							if( ad_mf <= 5.47911e+06 )
								if( ema3 <= 1.93695 )
									ret := 0.833333 // buy
								if( ema3 > 1.93695 )
									ret := -0.042307
							if( ad_mf > 5.47911e+06 )
								if( ema1 <= 2.33645 )
									ret := 1.000000 // buy
								if( ema1 > 2.33645 )
									ret := 0.909091 // buy
						if( ad_mf > 5.55107e+06 )
							if( ad <= 5.62384e+06 )
								if( ema13 <= 0.024516 )
									ret := -1.000000 // sell
								if( ema13 > 0.024516 )
									ret := -0.666667
							if( ad > 5.62384e+06 )
								if( ema13 <= 0.046753 )
									ret := -0.106762
								if( ema13 > 0.046753 )
									ret := -0.542857
				if( ad_mf > 2.50345e+07 )
					if( mf <= 0.325733 )
						if( ad_mf <= 3.7166e+07 )
							if( ema12 <= 0.020627 )
								if( ema12 <= 0.013256 )
									ret := -0.937500 // sell
								if( ema12 > 0.013256 )
									ret := -0.545455
							if( ema12 > 0.020627 )
								ret := -1.000000 // sell
						if( ad_mf > 3.7166e+07 )
							ret := -0.333333
					if( mf > 0.325733 )
						if( ad_mf <= 4.39501e+07 )
							ret := 0.466667
						if( ad_mf > 4.39501e+07 )
							ret := -0.818182 // sell
	
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

//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_ADAUSDT_30Min_e546fafe(ad, mf, ad_mf, ema3, tema, ema2, ema12, ema13, ema1)

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


