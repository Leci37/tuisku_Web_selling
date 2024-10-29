//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: SHIBUSDT_30Min_2CT0_fa317856 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHIBUSDT_30Min_2CT0_fa317856", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHIBUSDT_30Min_fa317856(mf, ad, ad_mf, ema1, tema, ema12, ema2, ema3, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ad_mf <= -3.81509e+10 )
		if( mf <= -0.114842 )
			if( ad <= -3.49728e+11 )
				if( ema3 <= 2.5e-05 )
					if( ad <= -4.89131e+11 )
						if( ad <= -7.03184e+11 )
							if( mf <= -0.1177 )
								if( tema <= 1.9e-05 )
									ret := 0.734694 // buy
								if( tema > 1.9e-05 )
									ret := 0.153846
							if( mf > -0.1177 )
								ret := -0.500000
						if( ad > -7.03184e+11 )
							if( ad <= -6.70344e+11 )
								if( mf <= -0.180739 )
									ret := -1.000000 // sell
								if( mf > -0.180739 )
									ret := -0.750000 // sell
							if( ad > -6.70344e+11 )
								if( tema <= 1.1e-05 )
									ret := 0.500000
								if( tema > 1.1e-05 )
									ret := -0.179487
					if( ad > -4.89131e+11 )
						if( mf <= -0.165828 )
							if( ema1 <= 9e-06 )
								if( ema2 <= 9e-06 )
									ret := 0.785714 // buy
								if( ema2 > 9e-06 )
									ret := 0.111111
							if( ema1 > 9e-06 )
								if( ad <= -4.65198e+11 )
									ret := 1.000000 // buy
								if( ad > -4.65198e+11 )
									ret := 0.903226 // buy
						if( mf > -0.165828 )
							if( ad_mf <= -3.83347e+11 )
								if( mf <= -0.127118 )
									ret := 0.541667
								if( mf > -0.127118 )
									ret := 1.000000 // buy
							if( ad_mf > -3.83347e+11 )
								if( ad_mf <= -3.69873e+11 )
									ret := -0.363636
								if( ad_mf > -3.69873e+11 )
									ret := 0.592593
				if( ema3 > 2.5e-05 )
					if( ad <= -1.74657e+12 )
						if( tema <= 2.6e-05 )
							ret := 0.750000 // buy
						if( tema > 2.6e-05 )
							ret := 1.000000 // buy
					if( ad > -1.74657e+12 )
						if( ad_mf <= -5.07282e+11 )
							if( ema2 <= 3.2e-05 )
								if( mf <= -0.40791 )
									ret := 0.250000
								if( mf > -0.40791 )
									ret := -0.657895
							if( ema2 > 3.2e-05 )
								if( ema3 <= 5.5e-05 )
									ret := 0.375000
								if( ema3 > 5.5e-05 )
									ret := -1.000000 // sell
						if( ad_mf > -5.07282e+11 )
							if( ema3 <= 5.3e-05 )
								if( ad <= -4.81457e+11 )
									ret := 1.000000 // buy
								if( ad > -4.81457e+11 )
									ret := 0.360000
							if( ema3 > 5.3e-05 )
								ret := -0.500000
			if( ad > -3.49728e+11 )
				if( ad_mf <= -3.82269e+10 )
					if( ad <= -3.37814e+11 )
						if( ema3 <= 7e-06 )
							ret := 1.000000 // buy
						if( ema3 > 7e-06 )
							if( mf <= -0.297154 )
								ret := 0.333333
							if( mf > -0.297154 )
								if( ema2 <= 3e-05 )
									ret := -0.807692 // sell
								if( ema2 > 3e-05 )
									ret := -0.333333
					if( ad > -3.37814e+11 )
						if( ad <= -3.18454e+11 )
							if( mf <= -0.157212 )
								if( ad_mf <= -3.31536e+11 )
									ret := 0.181818
								if( ad_mf > -3.31536e+11 )
									ret := 0.720000 // buy
							if( mf > -0.157212 )
								ret := 1.000000 // buy
						if( ad > -3.18454e+11 )
							if( ad <= -3.12383e+11 )
								if( ad_mf <= -3.16415e+11 )
									ret := 0.250000
								if( ad_mf > -3.16415e+11 )
									ret := -0.916667 // sell
							if( ad > -3.12383e+11 )
								if( ad_mf <= -2.93036e+11 )
									ret := 0.470588
								if( ad_mf > -2.93036e+11 )
									ret := 0.111383
				if( ad_mf > -3.82269e+10 )
					ret := 1.000000 // buy
		if( mf > -0.114842 )
			if( ad <= -4.70311e+10 )
				if( ema3 <= 4e-05 )
					if( ad_mf <= -4.94827e+10 )
						if( ad_mf <= -5.69556e+10 )
							if( ad_mf <= -5.73178e+10 )
								if( ad_mf <= -5.76616e+10 )
									ret := 0.085678
								if( ad_mf > -5.76616e+10 )
									ret := 0.473684
							if( ad_mf > -5.73178e+10 )
								if( mf <= -0.078228 )
									ret := 0.200000
								if( mf > -0.078228 )
									ret := -0.575758
						if( ad_mf > -5.69556e+10 )
							if( ema1 <= 3.7e-05 )
								if( ad_mf <= -5.64846e+10 )
									ret := 0.385714
								if( ad_mf > -5.64846e+10 )
									ret := 0.150943
							if( ema1 > 3.7e-05 )
								if( mf <= -0.031321 )
									ret := 0.600000
								if( mf > -0.031321 )
									ret := 1.000000 // buy
					if( ad_mf > -4.94827e+10 )
						if( ad_mf <= -4.90864e+10 )
							if( ad_mf <= -4.92879e+10 )
								if( ema1 <= 1.9e-05 )
									ret := 0.000000
								if( ema1 > 1.9e-05 )
									ret := -0.400000
							if( ad_mf > -4.92879e+10 )
								if( mf <= 0.001475 )
									ret := -0.500000
								if( mf > 0.001475 )
									ret := -0.782609 // sell
						if( ad_mf > -4.90864e+10 )
							if( ema3 <= 3.4e-05 )
								if( ad <= -4.7117e+10 )
									ret := -0.023256
								if( ad > -4.7117e+10 )
									ret := -0.687500
							if( ema3 > 3.4e-05 )
								ret := 0.800000 // buy
				if( ema3 > 4e-05 )
					if( ad_mf <= -4.15755e+11 )
						if( ad_mf <= -5.16001e+11 )
							if( ad_mf <= -2.30776e+12 )
								if( ad_mf <= -3.33203e+12 )
									ret := 0.000000
								if( ad_mf > -3.33203e+12 )
									ret := 1.000000 // buy
							if( ad_mf > -2.30776e+12 )
								if( ema1 <= 5e-05 )
									ret := 0.311688
								if( ema1 > 5e-05 )
									ret := -0.298851
						if( ad_mf > -5.16001e+11 )
							if( ema3 <= 4.1e-05 )
								ret := -0.200000
							if( ema3 > 4.1e-05 )
								if( tema <= 5.6e-05 )
									ret := 1.000000 // buy
								if( tema > 5.6e-05 )
									ret := 0.562500
					if( ad_mf > -4.15755e+11 )
						if( ad_mf <= -3.93653e+11 )
							if( mf <= -0.085327 )
								ret := -0.750000 // sell
							if( mf > -0.085327 )
								ret := -1.000000 // sell
						if( ad_mf > -3.93653e+11 )
							if( mf <= 0.246327 )
								if( mf <= 0.018261 )
									ret := -0.063401
								if( mf > 0.018261 )
									ret := -0.300000
							if( mf > 0.246327 )
								ret := 1.000000 // buy
			if( ad > -4.70311e+10 )
				if( tema <= 2.1e-05 )
					if( mf <= 0.010593 )
						if( ad <= -4.50562e+10 )
							if( mf <= -0.015499 )
								if( ad_mf <= -4.69493e+10 )
									ret := 1.000000 // buy
								if( ad_mf > -4.69493e+10 )
									ret := 0.441176
							if( mf > -0.015499 )
								if( mf <= 0.005726 )
									ret := -0.107143
								if( mf > 0.005726 )
									ret := 0.750000 // buy
						if( ad > -4.50562e+10 )
							if( ad_mf <= -4.4571e+10 )
								if( ad_mf <= -4.47244e+10 )
									ret := -0.571429
								if( ad_mf > -4.47244e+10 )
									ret := -0.937500 // sell
							if( ad_mf > -4.4571e+10 )
								if( ad_mf <= -4.37978e+10 )
									ret := 0.368421
								if( ad_mf > -4.37978e+10 )
									ret := 0.115646
					if( mf > 0.010593 )
						if( mf <= 0.062379 )
							if( ema3 <= 1.2e-05 )
								if( ad <= -3.88055e+10 )
									ret := 0.306878
								if( ad > -3.88055e+10 )
									ret := 0.750000 // buy
							if( ema3 > 1.2e-05 )
								if( ad_mf <= -3.98126e+10 )
									ret := 0.640777
								if( ad_mf > -3.98126e+10 )
									ret := 0.176471
						if( mf > 0.062379 )
							if( tema <= 7e-06 )
								if( ad <= -4.29644e+10 )
									ret := 0.777778 // buy
								if( ad > -4.29644e+10 )
									ret := 0.166667
							if( tema > 7e-06 )
								if( ad_mf <= -4.0228e+10 )
									ret := 0.253968
								if( ad_mf > -4.0228e+10 )
									ret := 0.031579
				if( tema > 2.1e-05 )
					if( ad_mf <= -4.50893e+10 )
						if( ad <= -4.64412e+10 )
							if( mf <= -0.010062 )
								if( ad_mf <= -4.67984e+10 )
									ret := 1.000000 // buy
								if( ad_mf > -4.67984e+10 )
									ret := -0.400000
							if( mf > -0.010062 )
								if( ema2 <= 3e-05 )
									ret := -0.818182 // sell
								if( ema2 > 3e-05 )
									ret := -0.250000
						if( ad > -4.64412e+10 )
							if( mf <= -0.09691 )
								ret := -0.833333 // sell
							if( mf > -0.09691 )
								if( ad_mf <= -4.53628e+10 )
									ret := 0.421053
								if( ad_mf > -4.53628e+10 )
									ret := 0.916667 // buy
					if( ad_mf > -4.50893e+10 )
						if( mf <= -0.053556 )
							if( ad <= -3.92941e+10 )
								if( ad <= -4.17144e+10 )
									ret := -0.146341
								if( ad > -4.17144e+10 )
									ret := -0.536585
							if( ad > -3.92941e+10 )
								if( mf <= -0.084415 )
									ret := 0.833333 // buy
								if( mf > -0.084415 )
									ret := 0.000000
						if( mf > -0.053556 )
							if( ad <= -4.03135e+10 )
								if( ad_mf <= -4.11056e+10 )
									ret := 0.012821
								if( ad_mf > -4.11056e+10 )
									ret := 0.625000
							if( ad > -4.03135e+10 )
								if( mf <= -0.004893 )
									ret := -0.523810
								if( mf > -0.004893 )
									ret := -0.062500
	if( ad_mf > -3.81509e+10 )
		if( ad_mf <= 8.97643e+11 )
			if( ad_mf <= 2.40406e+11 )
				if( ad <= 2.06055e+11 )
					if( ad <= 1.96625e+11 )
						if( mf <= 0.057553 )
							if( ad_mf <= 1.95483e+11 )
								if( tema <= 4e-05 )
									ret := 0.015189
								if( tema > 4e-05 )
									ret := -0.163701
							if( ad_mf > 1.95483e+11 )
								if( ad <= 1.96292e+11 )
									ret := 1.000000 // buy
								if( ad > 1.96292e+11 )
									ret := 0.727273 // buy
						if( mf > 0.057553 )
							if( ad_mf <= -1.3112e+10 )
								if( ad <= -1.9332e+10 )
									ret := 0.042758
								if( ad > -1.9332e+10 )
									ret := 0.267066
							if( ad_mf > -1.3112e+10 )
								if( ad <= 1.02079e+10 )
									ret := -0.007255
								if( ad > 1.02079e+10 )
									ret := 0.063083
					if( ad > 1.96625e+11 )
						if( ad_mf <= 2.03503e+11 )
							if( ad <= 2.0258e+11 )
								if( ad <= 2.00836e+11 )
									ret := -0.422222
								if( ad > 2.00836e+11 )
									ret := 0.290323
							if( ad > 2.0258e+11 )
								if( ema3 <= 9e-06 )
									ret := -0.333333
								if( ema3 > 9e-06 )
									ret := -0.904762 // sell
						if( ad_mf > 2.03503e+11 )
							if( ad_mf <= 2.05289e+11 )
								if( tema <= 1.5e-05 )
									ret := -0.333333
								if( tema > 1.5e-05 )
									ret := 0.800000 // buy
							if( ad_mf > 2.05289e+11 )
								if( tema <= 1.7e-05 )
									ret := -0.095238
								if( tema > 1.7e-05 )
									ret := -0.666667
				if( ad > 2.06055e+11 )
					if( ema2 <= 1.4e-05 )
						if( ad <= 2.10396e+11 )
							if( mf <= 0.150085 )
								if( ad <= 2.09642e+11 )
									ret := 0.190476
								if( ad > 2.09642e+11 )
									ret := 1.000000 // buy
							if( mf > 0.150085 )
								ret := 1.000000 // buy
						if( ad > 2.10396e+11 )
							if( mf <= 0.1205 )
								if( ad <= 2.3767e+11 )
									ret := 0.063492
								if( ad > 2.3767e+11 )
									ret := 0.812500 // buy
							if( mf > 0.1205 )
								if( mf <= 0.166984 )
									ret := -0.634615
								if( mf > 0.166984 )
									ret := 0.027027
					if( ema2 > 1.4e-05 )
						if( ad <= 2.1767e+11 )
							if( ad_mf <= 2.09668e+11 )
								if( ad_mf <= 2.08619e+11 )
									ret := 0.600000
								if( ad_mf > 2.08619e+11 )
									ret := -0.368421
							if( ad_mf > 2.09668e+11 )
								if( tema <= 4.3e-05 )
									ret := 0.529412
								if( tema > 4.3e-05 )
									ret := 1.000000 // buy
						if( ad > 2.1767e+11 )
							if( ad_mf <= 2.35436e+11 )
								if( ad <= 2.20898e+11 )
									ret := -0.695652
								if( ad > 2.20898e+11 )
									ret := 0.070588
							if( ad_mf > 2.35436e+11 )
								if( ad <= 2.40041e+11 )
									ret := 0.648649
								if( ad > 2.40041e+11 )
									ret := -0.333333
			if( ad_mf > 2.40406e+11 )
				if( ad_mf <= 2.41501e+11 )
					if( ema1 <= 1.5e-05 )
						if( ad <= 2.41002e+11 )
							if( ad <= 2.40817e+11 )
								ret := -0.500000
							if( ad > 2.40817e+11 )
								ret := -1.000000 // sell
						if( ad > 2.41002e+11 )
							ret := -0.333333
					if( ema1 > 1.5e-05 )
						if( ad_mf <= 2.41025e+11 )
							if( mf <= -0.028262 )
								ret := -1.000000 // sell
							if( mf > -0.028262 )
								ret := -0.500000
						if( ad_mf > 2.41025e+11 )
							ret := -1.000000 // sell
				if( ad_mf > 2.41501e+11 )
					if( ad <= 8.78216e+11 )
						if( ad <= 7.1144e+11 )
							if( mf <= 0.185929 )
								if( ad <= 4.08888e+11 )
									ret := 0.017070
								if( ad > 4.08888e+11 )
									ret := -0.079696
							if( mf > 0.185929 )
								if( ad <= 6.26917e+11 )
									ret := -0.201856
								if( ad > 6.26917e+11 )
									ret := -0.888889 // sell
						if( ad > 7.1144e+11 )
							if( mf <= 0.171182 )
								if( ad <= 7.23217e+11 )
									ret := 0.880000 // buy
								if( ad > 7.23217e+11 )
									ret := -0.095652
							if( mf > 0.171182 )
								if( tema <= 3.1e-05 )
									ret := 0.666667
								if( tema > 3.1e-05 )
									ret := 0.172414
					if( ad > 8.78216e+11 )
						if( ad <= 8.82362e+11 )
							ret := -1.000000 // sell
						if( ad > 8.82362e+11 )
							if( tema <= 1.8e-05 )
								if( ema1 <= 9e-06 )
									ret := 0.000000
								if( ema1 > 9e-06 )
									ret := -0.333333
							if( tema > 1.8e-05 )
								if( mf <= 0.110763 )
									ret := -1.000000 // sell
								if( mf > 0.110763 )
									ret := -0.500000
		if( ad_mf > 8.97643e+11 )
			if( mf <= 0.046075 )
				if( ema3 <= 4.1e-05 )
					if( ad <= 1.2474e+12 )
						if( ad_mf <= 9.79333e+11 )
							if( mf <= -0.104695 )
								if( ad_mf <= 9.24142e+11 )
									ret := 1.000000 // buy
								if( ad_mf > 9.24142e+11 )
									ret := 0.500000
							if( mf > -0.104695 )
								if( ad_mf <= 9.19277e+11 )
									ret := -0.166667
								if( ad_mf > 9.19277e+11 )
									ret := 0.437500
						if( ad_mf > 9.79333e+11 )
							if( ema13 <= -1e-06 )
								ret := 1.000000 // buy
							if( ema13 > -1e-06 )
								if( mf <= 0.002779 )
									ret := 0.555556
								if( mf > 0.002779 )
									ret := 1.000000 // buy
					if( ad > 1.2474e+12 )
						if( ad_mf <= 1.37893e+12 )
							if( mf <= -0.058423 )
								ret := -0.800000 // sell
							if( mf > -0.058423 )
								ret := -1.000000 // sell
						if( ad_mf > 1.37893e+12 )
							if( ema1 <= 3.7e-05 )
								if( mf <= -0.046962 )
									ret := 0.952381 // buy
								if( mf > -0.046962 )
									ret := 0.433962
							if( ema1 > 3.7e-05 )
								ret := -0.400000
				if( ema3 > 4.1e-05 )
					if( ema13 <= -2e-06 )
						ret := 1.000000 // buy
					if( ema13 > -2e-06 )
						ret := 0.750000 // buy
			if( mf > 0.046075 )
				if( ad_mf <= 9.99635e+11 )
					if( ema3 <= 9e-06 )
						ret := -0.500000
					if( ema3 > 9e-06 )
						if( ad <= 9.47315e+11 )
							if( tema <= 2e-05 )
								ret := -0.285714
							if( tema > 2e-05 )
								if( ad <= 9.23927e+11 )
									ret := 0.857143 // buy
								if( ad > 9.23927e+11 )
									ret := 0.000000
						if( ad > 9.47315e+11 )
							if( ema1 <= 1.3e-05 )
								ret := 0.750000 // buy
							if( ema1 > 1.3e-05 )
								ret := 1.000000 // buy
				if( ad_mf > 9.99635e+11 )
					if( ad <= 1.15557e+12 )
						if( ema1 <= 2.9e-05 )
							if( tema <= 2.5e-05 )
								if( mf <= 0.068998 )
									ret := 0.600000
								if( mf > 0.068998 )
									ret := -0.558140
							if( tema > 2.5e-05 )
								if( tema <= 2.7e-05 )
									ret := 0.666667
								if( tema > 2.7e-05 )
									ret := 0.000000
						if( ema1 > 2.9e-05 )
							if( ad_mf <= 1.01852e+12 )
								ret := 0.250000
							if( ad_mf > 1.01852e+12 )
								if( ad <= 1.08616e+12 )
									ret := -1.000000 // sell
								if( ad > 1.08616e+12 )
									ret := -0.625000
					if( ad > 1.15557e+12 )
						if( ema2 <= 7.2e-05 )
							if( ema3 <= 3.3e-05 )
								if( ema13 <= 2e-06 )
									ret := 0.031359
								if( ema13 > 2e-06 )
									ret := -0.800000 // sell
							if( ema3 > 3.3e-05 )
								if( ema13 <= 4e-06 )
									ret := 0.500000
								if( ema13 > 4e-06 )
									ret := -0.120000
						if( ema2 > 7.2e-05 )
							ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_SHIBUSDT_30Min_fa317856(mf, ad, ad_mf, ema1, tema, ema12, ema2, ema3, ema13)

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


