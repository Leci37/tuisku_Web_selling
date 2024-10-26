//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: PYPL_1Min_2TV0_fa03fe8b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PYPL_1Min_2TV0_fa03fe8b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PYPL_1Min_fa03fe8b(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= -0.001256 )
		if( VIP <= 1.55872 )
			if( ema13 <= -0.406112 )
				if( VIP <= 0.627617 )
					if( VIM <= 1.41895 )
						if( VIM <= 1.29735 )
							ret := -1.000000 // sell
						if( VIM > 1.29735 )
							if( ema13 <= -0.502051 )
								if( VIP <= 0.611713 )
									ret := 1.000000 // buy
								if( VIP > 0.611713 )
									ret := 0.750000 // buy
							if( ema13 > -0.502051 )
								ret := 0.000000
					if( VIM > 1.41895 )
						if( ema13 <= -0.84147 )
							ret := 1.000000 // buy
						if( ema13 > -0.84147 )
							if( ema12 <= -0.275364 )
								if( ema13 <= -0.620582 )
									ret := -0.230769
								if( ema13 > -0.620582 )
									ret := -0.952381 // sell
							if( ema12 > -0.275364 )
								if( VIM <= 1.49328 )
									ret := 0.666667
								if( VIM > 1.49328 )
									ret := -0.666667
				if( VIP > 0.627617 )
					if( ema1 <= 62.2099 )
						if( VIM <= 2.3123 )
							ret := 1.000000 // buy
						if( VIM > 2.3123 )
							ret := 0.800000 // buy
					if( ema1 > 62.2099 )
						if( VIP <= 0.91864 )
							if( ema1 <= 72.1839 )
								if( ema1 <= 63.7845 )
									ret := -0.400000
								if( ema1 > 63.7845 )
									ret := 0.574468
							if( ema1 > 72.1839 )
								if( VIP_VIM <= -0.664006 )
									ret := 0.615385
								if( VIP_VIM > -0.664006 )
									ret := -0.700000 // sell
						if( VIP > 0.91864 )
							ret := -0.857143 // sell
			if( ema13 > -0.406112 )
				if( ema13 <= -0.300393 )
					if( ema1 <= 66.4995 )
						if( VIP <= 0.686511 )
							if( ema3 <= 62.9873 )
								if( VIM <= 1.43263 )
									ret := -0.961538 // sell
								if( VIM > 1.43263 )
									ret := -0.333333
							if( ema3 > 62.9873 )
								if( ema12 <= -0.228256 )
									ret := -1.000000 // sell
								if( ema12 > -0.228256 )
									ret := 0.258065
						if( VIP > 0.686511 )
							if( VIP <= 1.13768 )
								if( ema13 <= -0.311172 )
									ret := 0.602410
								if( ema13 > -0.311172 )
									ret := 0.035714
							if( VIP > 1.13768 )
								ret := -0.800000 // sell
					if( ema1 > 66.4995 )
						if( VIP <= 0.566008 )
							if( ema12 <= -0.178124 )
								ret := 1.000000 // buy
							if( ema12 > -0.178124 )
								ret := 0.500000
						if( VIP > 0.566008 )
							if( tema <= 74.7012 )
								if( ema12 <= -0.241778 )
									ret := 0.700000 // buy
								if( ema12 > -0.241778 )
									ret := -0.572917
							if( tema > 74.7012 )
								if( ema2 <= 79.8826 )
									ret := 0.545455
								if( ema2 > 79.8826 )
									ret := -0.621622
				if( ema13 > -0.300393 )
					if( VIP_VIM <= -0.288647 )
						if( ema1 <= 80.8443 )
							if( ema12 <= -0.058791 )
								if( ema3 <= 57.7347 )
									ret := -0.486111
								if( ema3 > 57.7347 )
									ret := 0.158160
							if( ema12 > -0.058791 )
								if( VIP <= 0.923238 )
									ret := 0.040246
								if( VIP > 0.923238 )
									ret := 0.244530
						if( ema1 > 80.8443 )
							if( ema3 <= 81.2515 )
								if( VIM <= 1.26544 )
									ret := -0.291667
								if( VIM > 1.26544 )
									ret := -0.810345 // sell
							if( ema3 > 81.2515 )
								if( ema2 <= 81.6714 )
									ret := 0.114754
								if( ema2 > 81.6714 )
									ret := -0.571429
					if( VIP_VIM > -0.288647 )
						if( ema1 <= 57.4817 )
							if( ema2 <= 57.4841 )
								if( VIM <= 1.14869 )
									ret := 0.967742 // buy
								if( VIM > 1.14869 )
									ret := 0.250000
							if( ema2 > 57.4841 )
								ret := 0.142857
						if( ema1 > 57.4817 )
							if( ema13 <= -0.134362 )
								if( VIM <= 1.16586 )
									ret := -0.247863
								if( VIM > 1.16586 )
									ret := 0.467532
							if( ema13 > -0.134362 )
								if( VIM <= 1.29395 )
									ret := 0.045233
								if( VIM > 1.29395 )
									ret := -0.129464
		if( VIP > 1.55872 )
			if( ema13 <= -0.064866 )
				if( ema13 <= -1.45308 )
					if( ema1 <= 59.3778 )
						ret := -1.000000 // sell
					if( ema1 > 59.3778 )
						ret := -0.750000 // sell
				if( ema13 > -1.45308 )
					if( tema <= 58.6269 )
						if( VIP_VIM <= -0.471168 )
							if( VIP <= 68.6199 )
								ret := 1.000000 // buy
							if( VIP > 68.6199 )
								if( ema2 <= 58.0436 )
									ret := 1.000000 // buy
								if( ema2 > 58.0436 )
									ret := -0.250000
						if( VIP_VIM > -0.471168 )
							if( ema12 <= -0.046188 )
								if( VIP_VIM <= 0.351852 )
									ret := 0.307692
								if( VIP_VIM > 0.351852 )
									ret := 0.833333 // buy
							if( ema12 > -0.046188 )
								ret := -0.250000
					if( tema > 58.6269 )
						if( VIP_VIM <= 0.27821 )
							if( VIP <= 2.97438 )
								if( ema2 <= 67.6137 )
									ret := 0.115152
								if( ema2 > 67.6137 )
									ret := 0.567308
							if( VIP > 2.97438 )
								if( ema1 <= 64.3138 )
									ret := 0.370107
								if( ema1 > 64.3138 )
									ret := 0.644391
						if( VIP_VIM > 0.27821 )
							if( VIP_VIM <= 1.02058 )
								if( tema <= 64.7399 )
									ret := -0.189189
								if( tema > 64.7399 )
									ret := 0.250000
							if( VIP_VIM > 1.02058 )
								if( ema3 <= 71.2796 )
									ret := -0.266667
								if( ema3 > 71.2796 )
									ret := -1.000000 // sell
			if( ema13 > -0.064866 )
				if( ema13 <= 0.005409 )
					if( tema <= 60.2838 )
						if( VIM <= 3.89317 )
							if( ema12 <= -0.026277 )
								if( VIP <= 1.59658 )
									ret := -0.750000 // sell
								if( VIP > 1.59658 )
									ret := 0.647059
							if( ema12 > -0.026277 )
								if( ema1 <= 58.1664 )
									ret := 0.666667
								if( ema1 > 58.1664 )
									ret := 0.063939
						if( VIM > 3.89317 )
							if( ema12 <= -0.027206 )
								if( ema3 <= 59.7396 )
									ret := -0.127660
								if( ema3 > 59.7396 )
									ret := 0.800000 // buy
							if( ema12 > -0.027206 )
								if( VIP <= 233.485 )
									ret := 0.536524
								if( VIP > 233.485 )
									ret := -0.363636
					if( tema > 60.2838 )
						if( ema2 <= 61.8923 )
							if( ema2 <= 61.2192 )
								if( tema <= 60.7291 )
									ret := 0.000000
								if( tema > 60.7291 )
									ret := 0.363128
							if( ema2 > 61.2192 )
								if( ema3 <= 61.5515 )
									ret := -0.685714
								if( ema3 > 61.5515 )
									ret := -0.108434
						if( ema2 > 61.8923 )
							if( ema12 <= -0.019032 )
								if( ema3 <= 67.0335 )
									ret := 0.349640
								if( ema3 > 67.0335 )
									ret := 0.162325
							if( ema12 > -0.019032 )
								if( tema <= 64.4747 )
									ret := 0.196721
								if( tema > 64.4747 )
									ret := 0.060365
				if( ema13 > 0.005409 )
					if( ema1 <= 70.8191 )
						if( VIP <= 3.66363 )
							if( tema <= 60.5077 )
								if( ema2 <= 58.5908 )
									ret := 0.000000
								if( ema2 > 58.5908 )
									ret := 0.800000 // buy
							if( tema > 60.5077 )
								if( VIM <= 2.74961 )
									ret := 0.442623
								if( VIM > 2.74961 )
									ret := -0.038462
						if( VIP > 3.66363 )
							if( VIP_VIM <= 0.804548 )
								if( ema13 <= 0.007204 )
									ret := 0.466667
								if( ema13 > 0.007204 )
									ret := 0.821053 // buy
							if( VIP_VIM > 0.804548 )
								if( ema3 <= 58.8746 )
									ret := -0.500000
								if( ema3 > 58.8746 )
									ret := 0.666667
					if( ema1 > 70.8191 )
						if( ema13 <= 0.008109 )
							if( VIM <= 2.35133 )
								ret := 0.250000
							if( VIM > 2.35133 )
								if( VIM <= 6.23291 )
									ret := 1.000000 // buy
								if( VIM > 6.23291 )
									ret := 0.750000 // buy
						if( ema13 > 0.008109 )
							if( ema12 <= -0.004341 )
								if( ema1 <= 72.5277 )
									ret := -0.750000 // sell
								if( ema1 > 72.5277 )
									ret := 0.000000
							if( ema12 > -0.004341 )
								if( VIM <= 2.33608 )
									ret := 0.714286 // buy
								if( VIM > 2.33608 )
									ret := 0.142857
	if( ema12 > -0.001256 )
		if( VIP <= 1.49016 )
			if( ema12 <= 0.183734 )
				if( ema3 <= 57.7721 )
					if( tema <= 57.6296 )
						if( ema1 <= 57.3896 )
							ret := 1.000000 // buy
						if( ema1 > 57.3896 )
							if( VIP_VIM <= 0.498945 )
								if( ema12 <= 0.017353 )
									ret := -0.069767
								if( ema12 > 0.017353 )
									ret := 0.404255
							if( VIP_VIM > 0.498945 )
								if( ema1 <= 57.4754 )
									ret := 0.000000
								if( ema1 > 57.4754 )
									ret := -0.565217
					if( tema > 57.6296 )
						if( ema2 <= 57.6151 )
							if( ema13 <= 0.091282 )
								if( VIP_VIM <= 0.461157 )
									ret := 0.970588 // buy
								if( VIP_VIM > 0.461157 )
									ret := 0.500000
							if( ema13 > 0.091282 )
								ret := 0.000000
						if( ema2 > 57.6151 )
							if( tema <= 57.7132 )
								if( tema <= 57.6647 )
									ret := -0.500000
								if( tema > 57.6647 )
									ret := 0.000000
							if( tema > 57.7132 )
								if( tema <= 57.9776 )
									ret := 0.441176
								if( tema > 57.9776 )
									ret := 0.882353 // buy
				if( ema3 > 57.7721 )
					if( ema13 <= 0.222309 )
						if( ema1 <= 58.3096 )
							if( tema <= 58.3122 )
								if( ema3 <= 57.8833 )
									ret := -0.349515
								if( ema3 > 57.8833 )
									ret := -0.067083
							if( tema > 58.3122 )
								if( ema1 <= 58.2124 )
									ret := 0.555556
								if( ema1 > 58.2124 )
									ret := -0.611765
						if( ema1 > 58.3096 )
							if( ema2 <= 58.3306 )
								if( ema13 <= 0.107291 )
									ret := 0.397059
								if( ema13 > 0.107291 )
									ret := 1.000000 // buy
							if( ema2 > 58.3306 )
								if( tema <= 58.4599 )
									ret := -0.456140
								if( tema > 58.4599 )
									ret := 0.028749
					if( ema13 > 0.222309 )
						if( ema12 <= 0.117714 )
							if( VIP_VIM <= 0.213477 )
								if( ema12 <= 0.098356 )
									ret := -0.636364
								if( ema12 > 0.098356 )
									ret := -1.000000 // sell
							if( VIP_VIM > 0.213477 )
								if( ema3 <= 60.0968 )
									ret := -0.846154 // sell
								if( ema3 > 60.0968 )
									ret := -0.235294
						if( ema12 > 0.117714 )
							if( ema1 <= 75.2114 )
								if( ema1 <= 72.5704 )
									ret := -0.089888
								if( ema1 > 72.5704 )
									ret := -0.875000 // sell
							if( ema1 > 75.2114 )
								if( VIM <= 0.799978 )
									ret := -0.133333
								if( VIM > 0.799978 )
									ret := 0.694444
			if( ema12 > 0.183734 )
				if( ema1 <= 72.0327 )
					if( ema1 <= 70.731 )
						if( ema1 <= 69.2414 )
							if( ema13 <= 0.640623 )
								if( ema12 <= 0.264814 )
									ret := 0.509615
								if( ema12 > 0.264814 )
									ret := 0.891892 // buy
							if( ema13 > 0.640623 )
								if( ema12 <= 0.510822 )
									ret := -0.600000
								if( ema12 > 0.510822 )
									ret := 0.736842 // buy
						if( ema1 > 69.2414 )
							if( ema1 <= 70.3494 )
								if( VIP <= 1.14831 )
									ret := -0.500000
								if( VIP > 1.14831 )
									ret := -1.000000 // sell
							if( ema1 > 70.3494 )
								if( VIM <= 0.7565 )
									ret := -0.545455
								if( VIM > 0.7565 )
									ret := 0.857143 // buy
					if( ema1 > 70.731 )
						if( VIP <= 1.21753 )
							ret := 0.000000
						if( VIP > 1.21753 )
							if( ema12 <= 0.574631 )
								ret := 1.000000 // buy
							if( ema12 > 0.574631 )
								ret := 0.600000
				if( ema1 > 72.0327 )
					if( ema2 <= 75.036 )
						if( ema3 <= 72.0318 )
							if( ema12 <= 0.214574 )
								ret := -0.200000
							if( ema12 > 0.214574 )
								if( ema1 <= 72.1722 )
									ret := -0.500000
								if( ema1 > 72.1722 )
									ret := -0.941176 // sell
						if( ema3 > 72.0318 )
							ret := -1.000000 // sell
					if( ema2 > 75.036 )
						if( ema2 <= 77.9626 )
							if( ema3 <= 76.398 )
								ret := -0.500000
							if( ema3 > 76.398 )
								ret := 1.000000 // buy
						if( ema2 > 77.9626 )
							if( VIP <= 1.40826 )
								if( VIM <= 0.633828 )
									ret := -0.750000 // sell
								if( VIM > 0.633828 )
									ret := -1.000000 // sell
							if( VIP > 1.40826 )
								ret := 0.000000
		if( VIP > 1.49016 )
			if( ema12 <= 0.015349 )
				if( ema13 <= 0.016814 )
					if( VIP_VIM <= -0.174979 )
						if( ema13 <= -0.001436 )
							if( ema2 <= 69.4611 )
								if( ema12 <= 0.000298 )
									ret := 0.115385
								if( ema12 > 0.000298 )
									ret := -0.326923
							if( ema2 > 69.4611 )
								if( ema2 <= 71.7917 )
									ret := 0.882353 // buy
								if( ema2 > 71.7917 )
									ret := 0.100000
						if( ema13 > -0.001436 )
							if( VIM <= 60.164 )
								if( ema12 <= 0.003684 )
									ret := 0.288462
								if( ema12 > 0.003684 )
									ret := 0.055016
							if( VIM > 60.164 )
								if( VIP <= 75.5657 )
									ret := 0.920000 // buy
								if( VIP > 75.5657 )
									ret := 0.000000
					if( VIP_VIM > -0.174979 )
						if( VIP <= 8.11552 )
							if( ema2 <= 62.2914 )
								if( ema13 <= -0.008341 )
									ret := -0.615385
								if( ema13 > -0.008341 )
									ret := -0.225389
							if( ema2 > 62.2914 )
								if( ema1 <= 62.4935 )
									ret := 0.857143 // buy
								if( ema1 > 62.4935 )
									ret := -0.092564
						if( VIP > 8.11552 )
							if( ema13 <= -0.004531 )
								if( VIP <= 35.5926 )
									ret := -0.166667
								if( VIP > 35.5926 )
									ret := -0.777778 // sell
							if( ema13 > -0.004531 )
								if( VIM <= 74.2907 )
									ret := 0.112500
								if( VIM > 74.2907 )
									ret := 0.722222 // buy
				if( ema13 > 0.016814 )
					if( ema2 <= 80.3144 )
						if( VIP <= 3.92934 )
							if( VIM <= 3.97711 )
								if( tema <= 60.8618 )
									ret := 0.327684
								if( tema > 60.8618 )
									ret := 0.094340
							if( VIM > 3.97711 )
								if( ema3 <= 59.8191 )
									ret := 0.333333
								if( ema3 > 59.8191 )
									ret := -0.583333
						if( VIP > 3.92934 )
							if( tema <= 59.767 )
								if( ema2 <= 58.6723 )
									ret := 0.250000
								if( ema2 > 58.6723 )
									ret := -0.186441
							if( tema > 59.767 )
								if( VIM <= 3.80459 )
									ret := -0.027778
								if( VIM > 3.80459 )
									ret := 0.404908
					if( ema2 > 80.3144 )
						if( ema3 <= 81.6328 )
							if( VIP <= 7.77567 )
								if( VIM <= 5.23077 )
									ret := -0.300000
								if( VIM > 5.23077 )
									ret := -0.857143 // sell
							if( VIP > 7.77567 )
								if( VIP_VIM <= 0.182815 )
									ret := 0.750000 // buy
								if( VIP_VIM > 0.182815 )
									ret := -0.142857
						if( ema3 > 81.6328 )
							ret := -1.000000 // sell
			if( ema12 > 0.015349 )
				if( VIP_VIM <= 1.13199 )
					if( ema12 <= 0.045394 )
						if( ema1 <= 62.657 )
							if( ema2 <= 59.0889 )
								if( ema13 <= 0.030245 )
									ret := -0.410256
								if( ema13 > 0.030245 )
									ret := 0.179612
							if( ema2 > 59.0889 )
								if( ema13 <= 0.111497 )
									ret := -0.404762
								if( ema13 > 0.111497 )
									ret := 0.642857
						if( ema1 > 62.657 )
							if( ema13 <= 0.030288 )
								if( ema3 <= 65.4582 )
									ret := -0.444444
								if( ema3 > 65.4582 )
									ret := -0.041985
							if( ema13 > 0.030288 )
								if( ema2 <= 63.5219 )
									ret := 0.382653
								if( ema2 > 63.5219 )
									ret := 0.004975
					if( ema12 > 0.045394 )
						if( VIM <= 0.882211 )
							if( ema12 <= 0.102356 )
								if( ema13 <= 0.106026 )
									ret := -0.175439
								if( ema13 > 0.106026 )
									ret := 0.391608
							if( ema12 > 0.102356 )
								if( ema1 <= 77.9612 )
									ret := -0.243421
								if( ema1 > 77.9612 )
									ret := -0.878788 // sell
						if( VIM > 0.882211 )
							if( tema <= 68.6167 )
								if( VIP_VIM <= 0.10961 )
									ret := -0.169118
								if( VIP_VIM > 0.10961 )
									ret := -0.480091
							if( tema > 68.6167 )
								if( ema12 <= 0.082023 )
									ret := -0.010753
								if( ema12 > 0.082023 )
									ret := -0.353846
				if( VIP_VIM > 1.13199 )
					if( ema13 <= 0.049611 )
						if( ema1 <= 70.7158 )
							if( ema1 <= 58.1961 )
								if( ema12 <= 0.02187 )
									ret := 0.750000 // buy
								if( ema12 > 0.02187 )
									ret := 1.000000 // buy
							if( ema1 > 58.1961 )
								if( ema12 <= 0.024984 )
									ret := -0.373333
								if( ema12 > 0.024984 )
									ret := -0.754717 // sell
						if( ema1 > 70.7158 )
							if( ema13 <= 0.035913 )
								if( VIP_VIM <= 1.94811 )
									ret := 0.833333 // buy
								if( VIP_VIM > 1.94811 )
									ret := 0.125000
							if( ema13 > 0.035913 )
								if( VIM <= 26.1014 )
									ret := -0.210526
								if( VIM > 26.1014 )
									ret := 0.333333
					if( ema13 > 0.049611 )
						if( VIM <= 0.742516 )
							if( VIP <= 1.62658 )
								if( ema12 <= 0.101631 )
									ret := 0.705882 // buy
								if( ema12 > 0.101631 )
									ret := -0.416667
							if( VIP > 1.62658 )
								if( ema12 <= 0.162061 )
									ret := -0.565217
								if( ema12 > 0.162061 )
									ret := -0.950000 // sell
						if( VIM > 0.742516 )
							if( VIM <= 45.0804 )
								if( ema1 <= 79.2 )
									ret := 0.274510
								if( ema1 > 79.2 )
									ret := -0.297297
							if( VIM > 45.0804 )
								if( ema1 <= 65.3301 )
									ret := -1.000000 // sell
								if( ema1 > 65.3301 )
									ret := 0.666667
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_PYPL_1Min_fa03fe8b(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)

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


