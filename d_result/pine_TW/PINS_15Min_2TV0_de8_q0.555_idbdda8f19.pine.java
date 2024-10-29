//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: PINS_15Min_2TV0_bdda8f19 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PINS_15Min_2TV0_bdda8f19", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PINS_15Min_bdda8f19(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema12 <= 0.020634 )
		if( VIP_VIM <= -0.525728 )
			if( ema3 <= 25.0405 )
				if( VIP_VIM <= -0.660034 )
					if( ema13 <= -2.28831 )
						ret := -0.904762 // sell
					if( ema13 > -2.28831 )
						if( VIM <= 2.17527 )
							if( ema13 <= -0.630005 )
								if( ema3 <= 20.8827 )
									ret := 0.858491 // buy
								if( ema3 > 20.8827 )
									ret := 0.552239
							if( ema13 > -0.630005 )
								if( ema3 <= 24.4392 )
									ret := 0.293292
								if( ema3 > 24.4392 )
									ret := 0.770115 // buy
						if( VIM > 2.17527 )
							if( VIP <= 1.30323 )
								ret := 0.300000
							if( VIP > 1.30323 )
								if( ema3 <= 21.6024 )
									ret := 0.695122
								if( ema3 > 21.6024 )
									ret := 0.884211 // buy
				if( VIP_VIM > -0.660034 )
					if( ema13 <= -0.632621 )
						if( VIM <= 1.27846 )
							ret := 0.000000
						if( VIM > 1.27846 )
							if( VIP <= 0.695821 )
								ret := 0.578947
							if( VIP > 0.695821 )
								ret := 1.000000 // buy
					if( ema13 > -0.632621 )
						if( ema1 <= 22.1339 )
							if( ema13 <= -0.437388 )
								if( ema3 <= 16.1721 )
									ret := -1.000000 // sell
								if( ema3 > 16.1721 )
									ret := -0.258621
							if( ema13 > -0.437388 )
								if( tema <= 18.721 )
									ret := 0.364372
								if( tema > 18.721 )
									ret := -0.037406
						if( ema1 > 22.1339 )
							if( ema13 <= -0.337423 )
								if( ema1 <= 22.2659 )
									ret := 0.285714
								if( ema1 > 22.2659 )
									ret := 0.751938 // buy
							if( ema13 > -0.337423 )
								if( ema13 <= -0.162437 )
									ret := -0.102564
								if( ema13 > -0.162437 )
									ret := 0.347826
			if( ema3 > 25.0405 )
				if( ema2 <= 31.2775 )
					if( VIM <= 2.63019 )
						if( tema <= 25.8876 )
							if( ema3 <= 26.4433 )
								if( VIM <= 1.34236 )
									ret := -0.415000
								if( VIM > 1.34236 )
									ret := 0.264019
							if( ema3 > 26.4433 )
								if( VIM <= 1.47944 )
									ret := 0.867470 // buy
								if( VIM > 1.47944 )
									ret := 0.461538
						if( tema > 25.8876 )
							if( ema13 <= -0.742169 )
								if( tema <= 28.844 )
									ret := -0.643836
								if( tema > 28.844 )
									ret := -0.037037
							if( ema13 > -0.742169 )
								if( ema13 <= -0.680591 )
									ret := 0.612903
								if( ema13 > -0.680591 )
									ret := -0.131304
					if( VIM > 2.63019 )
						if( VIM <= 2.98913 )
							if( ema2 <= 28.1093 )
								if( ema3 <= 26.204 )
									ret := -0.625000
								if( ema3 > 26.204 )
									ret := -1.000000 // sell
							if( ema2 > 28.1093 )
								ret := -0.125000
						if( VIM > 2.98913 )
							if( ema13 <= -0.066399 )
								if( VIP_VIM <= -0.755869 )
									ret := 0.666667
								if( VIP_VIM > -0.755869 )
									ret := 0.187500
							if( ema13 > -0.066399 )
								if( ema3 <= 25.6076 )
									ret := -1.000000 // sell
								if( ema3 > 25.6076 )
									ret := -0.514286
				if( ema2 > 31.2775 )
					if( ema1 <= 81.505 )
						if( ema12 <= -0.297648 )
							if( tema <= 35.3766 )
								if( ema3 <= 35.6897 )
									ret := 0.420213
								if( ema3 > 35.6897 )
									ret := 0.811024 // buy
							if( tema > 35.3766 )
								if( tema <= 76.1006 )
									ret := 0.208015
								if( tema > 76.1006 )
									ret := -0.421687
						if( ema12 > -0.297648 )
							if( ema1 <= 73.2344 )
								if( ema3 <= 71.154 )
									ret := -0.028231
								if( ema3 > 71.154 )
									ret := 0.620690
							if( ema1 > 73.2344 )
								if( ema13 <= -0.159759 )
									ret := -0.883721 // sell
								if( ema13 > -0.159759 )
									ret := -0.160000
					if( ema1 > 81.505 )
						if( tema <= 84.3253 )
							if( VIP <= 0.755228 )
								if( ema13 <= -1.64714 )
									ret := 1.000000 // buy
								if( ema13 > -1.64714 )
									ret := 0.333333
							if( VIP > 0.755228 )
								if( ema2 <= 85.5837 )
									ret := 0.909091 // buy
								if( ema2 > 85.5837 )
									ret := 1.000000 // buy
						if( tema > 84.3253 )
							ret := 0.083333
		if( VIP_VIM > -0.525728 )
			if( ema1 <= 85.8388 )
				if( VIM <= 1.56468 )
					if( ema13 <= 0.005 )
						if( ema12 <= -0.050749 )
							if( tema <= 10.9299 )
								if( VIP_VIM <= -0.13643 )
									ret := 1.000000 // buy
								if( VIP_VIM > -0.13643 )
									ret := 0.733333 // buy
							if( tema > 10.9299 )
								if( ema12 <= -0.383941 )
									ret := -0.105052
								if( ema12 > -0.383941 )
									ret := 0.031350
						if( ema12 > -0.050749 )
							if( tema <= 27.3644 )
								if( ema3 <= 27.1837 )
									ret := -0.075141
								if( ema3 > 27.1837 )
									ret := -0.477477
							if( tema > 27.3644 )
								if( tema <= 28.2335 )
									ret := 0.318766
								if( tema > 28.2335 )
									ret := 0.009432
					if( ema13 > 0.005 )
						if( VIM <= 1.33249 )
							if( ema2 <= 17.0067 )
								if( tema <= 13.7288 )
									ret := -0.280000
								if( tema > 13.7288 )
									ret := -0.791045 // sell
							if( ema2 > 17.0067 )
								if( ema1 <= 24.4148 )
									ret := 0.223802
								if( ema1 > 24.4148 )
									ret := 0.042941
						if( VIM > 1.33249 )
							if( VIP <= 1.22185 )
								if( VIP_VIM <= -0.437495 )
									ret := 0.722222 // buy
								if( VIP_VIM > -0.437495 )
									ret := -0.421053
							if( VIP > 1.22185 )
								if( ema13 <= 0.039441 )
									ret := -0.059211
								if( ema13 > 0.039441 )
									ret := 0.412587
				if( VIM > 1.56468 )
					if( ema1 <= 20.5942 )
						if( ema13 <= -0.542941 )
							if( VIP_VIM <= -0.325332 )
								ret := -0.846154 // sell
							if( VIP_VIM > -0.325332 )
								ret := -1.000000 // sell
						if( ema13 > -0.542941 )
							if( ema3 <= 14.7021 )
								if( ema2 <= 11.4655 )
									ret := -0.500000
								if( ema2 > 11.4655 )
									ret := 0.790698 // buy
							if( ema3 > 14.7021 )
								if( ema1 <= 16.5031 )
									ret := -0.979167 // sell
								if( ema1 > 16.5031 )
									ret := -0.105983
					if( ema1 > 20.5942 )
						if( ema2 <= 23.0176 )
							if( ema13 <= -0.022102 )
								if( VIP <= 1.24374 )
									ret := 0.000000
								if( VIP > 1.24374 )
									ret := 0.675926
							if( ema13 > -0.022102 )
								if( tema <= 21.4978 )
									ret := 0.444444
								if( tema > 21.4978 )
									ret := -0.129252
						if( ema2 > 23.0176 )
							if( ema12 <= -0.000803 )
								if( ema1 <= 23.7271 )
									ret := -0.316038
								if( ema1 > 23.7271 )
									ret := 0.186832
							if( ema12 > -0.000803 )
								if( tema <= 25.5396 )
									ret := -0.439759
								if( tema > 25.5396 )
									ret := 0.007974
			if( ema1 > 85.8388 )
				if( tema <= 85.8205 )
					if( VIM <= 1.16621 )
						ret := -0.750000 // sell
					if( VIM > 1.16621 )
						ret := -0.142857
				if( tema > 85.8205 )
					if( VIM <= 1.14516 )
						if( VIM <= 1.01601 )
							if( ema2 <= 86.0025 )
								ret := -1.000000 // sell
							if( ema2 > 86.0025 )
								ret := -0.888889 // sell
						if( VIM > 1.01601 )
							if( VIM <= 1.09285 )
								ret := -0.333333
							if( VIM > 1.09285 )
								ret := -0.777778 // sell
					if( VIM > 1.14516 )
						ret := -1.000000 // sell
	if( ema12 > 0.020634 )
		if( VIM <= 1.01131 )
			if( ema12 <= 0.261516 )
				if( ema3 <= 18.3993 )
					if( tema <= 18.4723 )
						if( VIP <= 1.24962 )
							if( tema <= 12.4478 )
								if( tema <= 11.8774 )
									ret := 0.900000 // buy
								if( tema > 11.8774 )
									ret := 1.000000 // buy
							if( tema > 12.4478 )
								if( ema1 <= 13.1618 )
									ret := -0.633333
								if( ema1 > 13.1618 )
									ret := 0.251613
						if( VIP > 1.24962 )
							if( tema <= 18.3447 )
								if( VIM <= 0.88223 )
									ret := -0.495935
								if( VIM > 0.88223 )
									ret := 0.235294
							if( tema > 18.3447 )
								ret := 0.857143 // buy
					if( tema > 18.4723 )
						if( ema3 <= 18.1069 )
							if( ema1 <= 18.4598 )
								if( VIP_VIM <= 0.577994 )
									ret := 1.000000 // buy
								if( VIP_VIM > 0.577994 )
									ret := 0.916667 // buy
							if( ema1 > 18.4598 )
								ret := 0.833333 // buy
						if( ema3 > 18.1069 )
							if( ema3 <= 18.2307 )
								ret := -0.571429
							if( ema3 > 18.2307 )
								if( ema12 <= 0.084896 )
									ret := 0.806452 // buy
								if( ema12 > 0.084896 )
									ret := 0.346939
				if( ema3 > 18.3993 )
					if( VIP <= 1.05704 )
						if( ema1 <= 25.2556 )
							if( ema13 <= 0.17282 )
								if( ema1 <= 25.1704 )
									ret := -0.287671
								if( ema1 > 25.1704 )
									ret := -1.000000 // sell
							if( ema13 > 0.17282 )
								if( VIP <= 1.01862 )
									ret := -0.200000
								if( VIP > 1.01862 )
									ret := -0.750000 // sell
						if( ema1 > 25.2556 )
							if( ema2 <= 25.2838 )
								ret := 0.882353 // buy
							if( ema2 > 25.2838 )
								if( ema13 <= 0.288015 )
									ret := 0.027842
								if( ema13 > 0.288015 )
									ret := -0.206897
					if( VIP > 1.05704 )
						if( ema3 <= 47.2843 )
							if( tema <= 26.9302 )
								if( ema2 <= 19.0826 )
									ret := -0.227064
								if( ema2 > 19.0826 )
									ret := 0.064836
							if( tema > 26.9302 )
								if( VIP <= 1.7446 )
									ret := -0.046810
								if( VIP > 1.7446 )
									ret := 0.398058
						if( ema3 > 47.2843 )
							if( VIP_VIM <= 0.506416 )
								if( ema3 <= 54.0268 )
									ret := 0.329146
								if( ema3 > 54.0268 )
									ret := 0.034201
							if( VIP_VIM > 0.506416 )
								if( ema2 <= 78.9319 )
									ret := 0.240122
								if( ema2 > 78.9319 )
									ret := 0.886792 // buy
			if( ema12 > 0.261516 )
				if( ema3 <= 83.4274 )
					if( tema <= 81.7437 )
						if( VIP_VIM <= 0.867377 )
							if( ema1 <= 80.4184 )
								if( tema <= 76.8695 )
									ret := -0.144221
								if( tema > 76.8695 )
									ret := 0.250000
							if( ema1 > 80.4184 )
								if( VIP_VIM <= 0.583161 )
									ret := -0.888889 // sell
								if( VIP_VIM > 0.583161 )
									ret := -1.000000 // sell
						if( VIP_VIM > 0.867377 )
							if( ema1 <= 20.021 )
								if( VIP <= 1.4669 )
									ret := -1.000000 // sell
								if( VIP > 1.4669 )
									ret := -0.250000
							if( ema1 > 20.021 )
								if( ema13 <= 0.748127 )
									ret := 0.093617
								if( ema13 > 0.748127 )
									ret := 0.532468
					if( tema > 81.7437 )
						if( VIP_VIM <= 0.502804 )
							if( ema2 <= 82.776 )
								ret := 1.000000 // buy
							if( ema2 > 82.776 )
								if( tema <= 85.6621 )
									ret := 0.300000
								if( tema > 85.6621 )
									ret := 0.941176 // buy
						if( VIP_VIM > 0.502804 )
							if( ema13 <= 2.88129 )
								if( VIP <= 1.57152 )
									ret := 0.303030
								if( VIP > 1.57152 )
									ret := 0.888889 // buy
							if( ema13 > 2.88129 )
								ret := -0.250000
				if( ema3 > 83.4274 )
					if( ema3 <= 84.2949 )
						if( tema <= 84.9502 )
							ret := -0.785714 // sell
						if( tema > 84.9502 )
							if( ema2 <= 84.5856 )
								ret := -1.000000 // sell
							if( ema2 > 84.5856 )
								ret := -0.933333 // sell
					if( ema3 > 84.2949 )
						if( ema2 <= 86.1125 )
							if( VIP_VIM <= 0.56064 )
								if( ema1 <= 85.4147 )
									ret := -0.900000 // sell
								if( ema1 > 85.4147 )
									ret := -0.157895
							if( VIP_VIM > 0.56064 )
								ret := 0.466667
						if( ema2 > 86.1125 )
							if( ema12 <= 0.333625 )
								ret := -0.272727
							if( ema12 > 0.333625 )
								if( ema2 <= 86.9353 )
									ret := -0.935484 // sell
								if( ema2 > 86.9353 )
									ret := -0.700000 // sell
		if( VIM > 1.01131 )
			if( VIP <= 1.29322 )
				if( VIM <= 1.28947 )
					if( ema13 <= 0.160015 )
						if( ema12 <= 0.11881 )
							if( VIP <= 0.914608 )
								if( ema2 <= 19.6072 )
									ret := 0.909091 // buy
								if( ema2 > 19.6072 )
									ret := 0.129032
							if( VIP > 0.914608 )
								if( VIP_VIM <= -0.226987 )
									ret := 0.461538
								if( VIP_VIM > -0.226987 )
									ret := -0.106961
						if( ema12 > 0.11881 )
							if( ema2 <= 38.0057 )
								ret := 0.000000
							if( ema2 > 38.0057 )
								if( VIP <= 0.998126 )
									ret := -0.181818
								if( VIP > 0.998126 )
									ret := -0.750000 // sell
					if( ema13 > 0.160015 )
						if( tema <= 16.8615 )
							if( ema2 <= 14.9328 )
								ret := 0.777778 // buy
							if( ema2 > 14.9328 )
								ret := 1.000000 // buy
						if( tema > 16.8615 )
							if( ema2 <= 72.6942 )
								if( tema <= 72.4515 )
									ret := 0.062654
								if( tema > 72.4515 )
									ret := 0.930233 // buy
							if( ema2 > 72.6942 )
								if( ema13 <= 0.360151 )
									ret := -0.245161
								if( ema13 > 0.360151 )
									ret := 0.326531
				if( VIM > 1.28947 )
					if( tema <= 78.914 )
						if( tema <= 41.1902 )
							if( tema <= 32.688 )
								if( ema12 <= 0.041225 )
									ret := -0.051613
								if( ema12 > 0.041225 )
									ret := -0.486301
							if( tema > 32.688 )
								if( ema12 <= 0.031832 )
									ret := -0.304348
								if( ema12 > 0.031832 )
									ret := -0.701031 // sell
						if( tema > 41.1902 )
							if( ema12 <= 0.030102 )
								if( ema13 <= 0.086717 )
									ret := 0.631579
								if( ema13 > 0.086717 )
									ret := 1.000000 // buy
							if( ema12 > 0.030102 )
								if( ema1 <= 70.1805 )
									ret := -0.166667
								if( ema1 > 70.1805 )
									ret := -0.430233
					if( tema > 78.914 )
						ret := 0.785714 // buy
			if( VIP > 1.29322 )
				if( ema2 <= 17.987 )
					if( VIP <= 1.55183 )
						if( tema <= 17.933 )
							if( ema3 <= 17.6026 )
								if( ema3 <= 14.0195 )
									ret := 0.625000
								if( ema3 > 14.0195 )
									ret := -0.295775
							if( ema3 > 17.6026 )
								ret := 0.700000 // buy
						if( tema > 17.933 )
							ret := -1.000000 // sell
					if( VIP > 1.55183 )
						if( ema2 <= 13.0767 )
							if( tema <= 13.6195 )
								if( ema13 <= 0.069083 )
									ret := -1.000000 // sell
								if( ema13 > 0.069083 )
									ret := -0.550000
							if( tema > 13.6195 )
								ret := 0.900000 // buy
						if( ema2 > 13.0767 )
							if( tema <= 17.7326 )
								if( ema1 <= 16.1396 )
									ret := -0.875969 // sell
								if( ema1 > 16.1396 )
									ret := -0.416667
							if( tema > 17.7326 )
								if( VIP <= 2.0749 )
									ret := -1.000000 // sell
								if( VIP > 2.0749 )
									ret := -0.935484 // sell
				if( ema2 > 17.987 )
					if( ema12 <= 0.057886 )
						if( ema1 <= 20.4104 )
							if( ema3 <= 19.9363 )
								if( ema13 <= 0.037035 )
									ret := -0.708333 // sell
								if( ema13 > 0.037035 )
									ret := -0.090909
							if( ema3 > 19.9363 )
								if( VIM <= 1.62561 )
									ret := -0.960000 // sell
								if( VIM > 1.62561 )
									ret := -0.545455
						if( ema1 > 20.4104 )
							if( VIP_VIM <= -0.055726 )
								if( ema13 <= 0.001258 )
									ret := -0.592593
								if( ema13 > 0.001258 )
									ret := -0.194118
							if( VIP_VIM > -0.055726 )
								if( ema13 <= 0.103926 )
									ret := -0.073441
								if( ema13 > 0.103926 )
									ret := 0.194767
					if( ema12 > 0.057886 )
						if( ema3 <= 22.7132 )
							if( VIP_VIM <= 0.261735 )
								if( ema3 <= 21.957 )
									ret := -0.605882
								if( ema3 > 21.957 )
									ret := 0.107143
							if( VIP_VIM > 0.261735 )
								if( VIP <= 1.41476 )
									ret := 0.791667 // buy
								if( VIP > 1.41476 )
									ret := 0.264305
						if( ema3 > 22.7132 )
							if( tema <= 23.277 )
								if( ema1 <= 23.1172 )
									ret := -0.976744 // sell
								if( ema1 > 23.1172 )
									ret := -0.833333 // sell
							if( tema > 23.277 )
								if( ema13 <= 0.116263 )
									ret := -0.428021
								if( ema13 > 0.116263 )
									ret := -0.256041
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_PINS_15Min_bdda8f19(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)

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


