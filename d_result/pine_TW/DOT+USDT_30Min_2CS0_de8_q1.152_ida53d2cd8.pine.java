//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: DOTUSDT_30Min_2CS0_a53d2cd8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_30Min_2CS0_a53d2cd8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_30Min_a53d2cd8(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( k <= 59.3985 )
		if( rsi1 <= 41.4127 )
			if( smoothK_k <= 16.1457 )
				if( rsi1 <= 29.0107 )
					if( ad <= -841127 )
						if( ad_mf <= -1.16468e+06 )
							ret := -0.500000
						if( ad_mf > -1.16468e+06 )
							ret := 0.937500 // buy
					if( ad > -841127 )
						if( rsi1 <= 20.5864 )
							if( d_k <= 1.07929 )
								if( smoothD_d <= 10.956 )
									ret := -0.718174 // sell
								if( smoothD_d > 10.956 )
									ret := -0.270833
							if( d_k > 1.07929 )
								if( ad <= -37110.8 )
									ret := -0.902632 // sell
								if( ad > -37110.8 )
									ret := -0.771065 // sell
						if( rsi1 > 20.5864 )
							if( ad_mf <= 863315 )
								if( k <= 0.008213 )
									ret := -0.510152
								if( k > 0.008213 )
									ret := -0.683028
							if( ad_mf > 863315 )
								ret := 0.214286
				if( rsi1 > 29.0107 )
					if( d_k <= 0.972239 )
						if( d_k <= -2.86338 )
							if( smoothK_k <= 11.8911 )
								if( ad <= -259345 )
									ret := 0.328571
								if( ad > -259345 )
									ret := -0.250000
							if( smoothK_k > 11.8911 )
								if( ad_mf <= -260737 )
									ret := 0.266667
								if( ad_mf > -260737 )
									ret := -0.398887
						if( d_k > -2.86338 )
							if( d_k <= -1.55342 )
								if( ad <= -225563 )
									ret := -0.127273
								if( ad > -225563 )
									ret := -0.561254
							if( d_k > -1.55342 )
								if( d_k <= -1.25248 )
									ret := -0.163462
								if( d_k > -1.25248 )
									ret := -0.405983
					if( d_k > 0.972239 )
						if( ad <= -193030 )
							if( k <= 2.78023 )
								if( smoothK_k <= -2.86102 )
									ret := -0.171429
								if( smoothK_k > -2.86102 )
									ret := -0.702128 // sell
							if( k > 2.78023 )
								if( ad_mf <= -198947 )
									ret := -0.298246
								if( ad_mf > -198947 )
									ret := 0.606061
						if( ad > -193030 )
							if( ad_mf <= 41508.9 )
								if( smoothD_d <= 6.6437 )
									ret := -0.469697
								if( smoothD_d > 6.6437 )
									ret := -0.625045
							if( ad_mf > 41508.9 )
								if( ad <= 595614 )
									ret := -0.774543 // sell
								if( ad > 595614 )
									ret := 0.000000
			if( smoothK_k > 16.1457 )
				if( ad_mf <= -172703 )
					if( d_k <= -5.2178 )
						if( d <= 45.535 )
							if( ad <= -332792 )
								if( ad <= -601714 )
									ret := 0.500000
								if( ad > -601714 )
									ret := 0.777143 // buy
							if( ad > -332792 )
								if( ad <= -310944 )
									ret := -0.500000
								if( ad > -310944 )
									ret := 0.442982
						if( d > 45.535 )
							ret := -0.333333
					if( d_k > -5.2178 )
						if( smoothD_d <= 32.0255 )
							if( ad <= -220540 )
								if( ad_mf <= -608326 )
									ret := 0.896552 // buy
								if( ad_mf > -608326 )
									ret := 0.127490
							if( ad > -220540 )
								if( rsi1 <= 35.6403 )
									ret := -0.611111
								if( rsi1 > 35.6403 )
									ret := 0.028571
						if( smoothD_d > 32.0255 )
							if( mf <= -0.236059 )
								if( ad <= -437823 )
									ret := -0.454545
								if( ad > -437823 )
									ret := 0.650000
							if( mf > -0.236059 )
								if( ad_mf <= -498819 )
									ret := 0.000000
								if( ad_mf > -498819 )
									ret := -0.472222
				if( ad_mf > -172703 )
					if( d <= 36.4307 )
						if( d_k <= -3.05872 )
							if( smoothK_k <= 30.6122 )
								if( ad_mf <= -78813.9 )
									ret := 0.030928
								if( ad_mf > -78813.9 )
									ret := -0.281620
							if( smoothK_k > 30.6122 )
								if( mf <= 0.097718 )
									ret := 0.027778
								if( mf > 0.097718 )
									ret := -0.382716
						if( d_k > -3.05872 )
							if( k <= 27.0614 )
								if( d <= 27.1604 )
									ret := -0.478357
								if( d > 27.1604 )
									ret := -0.661808
							if( k > 27.0614 )
								if( rsi1 <= 40.276 )
									ret := -0.449472
								if( rsi1 > 40.276 )
									ret := -0.030928
					if( d > 36.4307 )
						if( d_k <= -2.68864 )
							if( d_k <= -8.82598 )
								if( rsi1 <= 28.414 )
									ret := -0.500000
								if( rsi1 > 28.414 )
									ret := 0.139683
							if( d_k > -8.82598 )
								if( ad_mf <= 445662 )
									ret := -0.296820
								if( ad_mf > 445662 )
									ret := 0.466667
						if( d_k > -2.68864 )
							if( mf <= -0.113055 )
								if( rsi1 <= 34.9564 )
									ret := -0.580645
								if( rsi1 > 34.9564 )
									ret := -0.325815
							if( mf > -0.113055 )
								if( mf <= 0.17777 )
									ret := -0.667111
								if( mf > 0.17777 )
									ret := -0.513158
		if( rsi1 > 41.4127 )
			if( k <= 19.3024 )
				if( ad_mf <= 104024 )
					if( d <= 24.1061 )
						if( k <= 10.4955 )
							if( ad <= -640289 )
								if( d <= 8.76211 )
									ret := 1.000000 // buy
								if( d > 8.76211 )
									ret := 0.615385
							if( ad > -640289 )
								if( d_k <= 2.67554 )
									ret := -0.080483
								if( d_k > 2.67554 )
									ret := -0.256442
						if( k > 10.4955 )
							if( ad_mf <= -211374 )
								if( mf <= 0.204643 )
									ret := 0.532609
								if( mf > 0.204643 )
									ret := -0.333333
							if( ad_mf > -211374 )
								if( d <= 17.779 )
									ret := 0.055940
								if( d > 17.779 )
									ret := -0.157609
					if( d > 24.1061 )
						if( rsi1 <= 60.5649 )
							if( ad_mf <= -251903 )
								if( rsi1 <= 50.9101 )
									ret := -0.966667 // sell
								if( rsi1 > 50.9101 )
									ret := -0.692308
							if( ad_mf > -251903 )
								if( ad_mf <= -136144 )
									ret := -0.125000
								if( ad_mf > -136144 )
									ret := -0.398594
						if( rsi1 > 60.5649 )
							if( ad <= -174842 )
								ret := 0.590909
							if( ad > -174842 )
								if( d_k <= 15.2859 )
									ret := 0.275862
								if( d_k > 15.2859 )
									ret := -0.145455
				if( ad_mf > 104024 )
					if( mf <= 0.112075 )
						if( ad <= 341958 )
							if( d_k <= -0.790485 )
								if( d_k <= -1.97881 )
									ret := -0.289474
								if( d_k > -1.97881 )
									ret := 0.193548
							if( d_k > -0.790485 )
								if( k <= 9.23774 )
									ret := -0.510204
								if( k > 9.23774 )
									ret := -0.699454
						if( ad > 341958 )
							if( mf <= 0.042062 )
								ret := 0.411765
							if( mf > 0.042062 )
								if( k <= 13.1081 )
									ret := -0.500000
								if( k > 13.1081 )
									ret := 0.000000
					if( mf > 0.112075 )
						if( rsi1 <= 62.0147 )
							if( d <= 8.76937 )
								if( smoothK_k <= 7.04819 )
									ret := -0.522013
								if( smoothK_k > 7.04819 )
									ret := -0.210526
							if( d > 8.76937 )
								if( ad <= 142776 )
									ret := -0.834711 // sell
								if( ad > 142776 )
									ret := -0.689781
						if( rsi1 > 62.0147 )
							if( smoothD_d <= 15.3617 )
								if( smoothD_d <= 13.3265 )
									ret := 0.000000
								if( smoothD_d > 13.3265 )
									ret := 0.416667
							if( smoothD_d > 15.3617 )
								if( d_k <= 14.8496 )
									ret := -0.263158
								if( d_k > 14.8496 )
									ret := -0.558824
			if( k > 19.3024 )
				if( d_k <= 1.92266 )
					if( ad_mf <= -83992.8 )
						if( smoothD_d <= 45.1883 )
							if( mf <= -0.007651 )
								if( d_k <= -1.11659 )
									ret := 0.755024 // buy
								if( d_k > -1.11659 )
									ret := 0.441379
							if( mf > -0.007651 )
								if( ad_mf <= -106271 )
									ret := 0.612200
								if( ad_mf > -106271 )
									ret := 0.314286
						if( smoothD_d > 45.1883 )
							if( mf <= 0.062214 )
								if( mf <= 0.038152 )
									ret := 0.367150
								if( mf > 0.038152 )
									ret := -0.204545
							if( mf > 0.062214 )
								if( smoothD_d <= 46.7377 )
									ret := -0.058824
								if( smoothD_d > 46.7377 )
									ret := 0.720339 // buy
					if( ad_mf > -83992.8 )
						if( d_k <= -4.52051 )
							if( smoothD_d <= 22.0451 )
								if( rsi1 <= 50.3058 )
									ret := 0.066038
								if( rsi1 > 50.3058 )
									ret := 0.359443
							if( smoothD_d > 22.0451 )
								if( rsi1 <= 44.8763 )
									ret := 0.046211
								if( rsi1 > 44.8763 )
									ret := 0.418192
						if( d_k > -4.52051 )
							if( rsi1 <= 50.957 )
								if( smoothK_k <= 55.1198 )
									ret := -0.138138
								if( smoothK_k > 55.1198 )
									ret := 0.282051
							if( rsi1 > 50.957 )
								if( mf <= 0.156384 )
									ret := 0.270666
								if( mf > 0.156384 )
									ret := -0.033040
				if( d_k > 1.92266 )
					if( ad <= 83931.4 )
						if( d_k <= 7.06317 )
							if( ad <= -178895 )
								if( smoothK_k <= 54.3652 )
									ret := 0.200599
								if( smoothK_k > 54.3652 )
									ret := 0.764706 // buy
							if( ad > -178895 )
								if( ad <= -167139 )
									ret := -0.745455 // sell
								if( ad > -167139 )
									ret := -0.047932
						if( d_k > 7.06317 )
							if( ad_mf <= -191230 )
								if( mf <= 0.12869 )
									ret := -0.068047
								if( mf > 0.12869 )
									ret := 0.191176
							if( ad_mf > -191230 )
								if( mf <= 0.25686 )
									ret := -0.256160
								if( mf > 0.25686 )
									ret := 0.020619
					if( ad > 83931.4 )
						if( d_k <= 5.23788 )
							if( rsi1 <= 50.4071 )
								if( rsi1 <= 42.0508 )
									ret := -0.133333
								if( rsi1 > 42.0508 )
									ret := -0.681081
							if( rsi1 > 50.4071 )
								if( rsi1 <= 51.2877 )
									ret := 0.578947
								if( rsi1 > 51.2877 )
									ret := -0.161871
						if( d_k > 5.23788 )
							if( ad <= 129766 )
								if( smoothK_k <= 55.7852 )
									ret := -0.499176
								if( smoothK_k > 55.7852 )
									ret := 0.111111
							if( ad > 129766 )
								if( rsi1 <= 63.3734 )
									ret := -0.721640 // sell
								if( rsi1 > 63.3734 )
									ret := -0.224719
	if( k > 59.3985 )
		if( d_k <= 2.67083 )
			if( k <= 82.5256 )
				if( rsi1 <= 50.8777 )
					if( d_k <= -5.09664 )
						if( mf <= -0.010578 )
							if( ad <= -44205.8 )
								if( rsi1 <= 28.6026 )
									ret := -0.692308
								if( rsi1 > 28.6026 )
									ret := 0.529412
							if( ad > -44205.8 )
								if( d_k <= -25.3993 )
									ret := 0.520661
								if( d_k > -25.3993 )
									ret := 0.218627
						if( mf > -0.010578 )
							if( rsi1 <= 43.984 )
								if( ad <= -175928 )
									ret := 0.657143
								if( ad > -175928 )
									ret := -0.073298
							if( rsi1 > 43.984 )
								if( mf <= 0.182883 )
									ret := 0.169946
								if( mf > 0.182883 )
									ret := -0.724138 // sell
					if( d_k > -5.09664 )
						if( ad_mf <= 60400.1 )
							if( d <= 74.8918 )
								if( smoothK_k <= 64.7292 )
									ret := -0.113290
								if( smoothK_k > 64.7292 )
									ret := 0.081425
							if( d > 74.8918 )
								if( d_k <= -3.39679 )
									ret := 0.266667
								if( d_k > -3.39679 )
									ret := -0.276786
						if( ad_mf > 60400.1 )
							if( ad <= 156996 )
								if( d_k <= -4.0845 )
									ret := -0.892857 // sell
								if( d_k > -4.0845 )
									ret := -0.527897
							if( ad > 156996 )
								if( mf <= 0.009011 )
									ret := 0.084034
								if( mf > 0.009011 )
									ret := -0.627907
				if( rsi1 > 50.8777 )
					if( d <= 67.6314 )
						if( ad <= -35318.4 )
							if( k <= 69.7666 )
								if( rsi1 <= 52.8628 )
									ret := 0.316176
								if( rsi1 > 52.8628 )
									ret := 0.662107
							if( k > 69.7666 )
								if( mf <= 0.118762 )
									ret := 0.829268 // buy
								if( mf > 0.118762 )
									ret := 0.644444
						if( ad > -35318.4 )
							if( d_k <= -1.54067 )
								if( mf <= 0.143968 )
									ret := 0.517606
								if( mf > 0.143968 )
									ret := 0.332258
							if( d_k > -1.54067 )
								if( rsi1 <= 60.9291 )
									ret := -0.054217
								if( rsi1 > 60.9291 )
									ret := 0.462687
					if( d > 67.6314 )
						if( ad_mf <= -32664.5 )
							if( smoothK_k <= 63.537 )
								ret := -0.538462
							if( smoothK_k > 63.537 )
								if( d_k <= 1.29758 )
									ret := 0.602162
								if( d_k > 1.29758 )
									ret := 0.188172
						if( ad_mf > -32664.5 )
							if( rsi1 <= 64.521 )
								if( k <= 71.8008 )
									ret := -0.017045
								if( k > 71.8008 )
									ret := 0.192998
							if( rsi1 > 64.521 )
								if( k <= 74.7039 )
									ret := 0.287356
								if( k > 74.7039 )
									ret := 0.529337
			if( k > 82.5256 )
				if( ad_mf <= -17827.8 )
					if( rsi1 <= 44.382 )
						if( smoothD_d <= 75.3568 )
							if( ad_mf <= -245273 )
								ret := 1.000000 // buy
							if( ad_mf > -245273 )
								if( mf <= -0.123207 )
									ret := 0.109091
								if( mf > -0.123207 )
									ret := 0.530303
						if( smoothD_d > 75.3568 )
							if( ad_mf <= -421244 )
								if( ad_mf <= -788953 )
									ret := 1.000000 // buy
								if( ad_mf > -788953 )
									ret := 0.888889 // buy
							if( ad_mf > -421244 )
								if( ad <= -20569.2 )
									ret := -0.167832
								if( ad > -20569.2 )
									ret := 0.937500 // buy
					if( rsi1 > 44.382 )
						if( d_k <= -1.24367 )
							if( ad <= -58981.3 )
								if( rsi1 <= 58.3812 )
									ret := 0.625000
								if( rsi1 > 58.3812 )
									ret := 0.792793 // buy
							if( ad > -58981.3 )
								if( mf <= 0.299218 )
									ret := 0.634302
								if( mf > 0.299218 )
									ret := -0.400000
						if( d_k > -1.24367 )
							if( rsi1 <= 50.8577 )
								if( ad_mf <= -213456 )
									ret := -0.392857
								if( ad_mf > -213456 )
									ret := 0.232877
							if( rsi1 > 50.8577 )
								if( rsi1 <= 63.5117 )
									ret := 0.431703
								if( rsi1 > 63.5117 )
									ret := 0.603365
				if( ad_mf > -17827.8 )
					if( ad <= 757432 )
						if( ad <= 35143.7 )
							if( rsi1 <= 58.4345 )
								if( d_k <= -5.83815 )
									ret := 0.221675
								if( d_k > -5.83815 )
									ret := 0.024420
							if( rsi1 > 58.4345 )
								if( mf <= -0.155168 )
									ret := 0.289593
								if( mf > -0.155168 )
									ret := 0.556606
						if( ad > 35143.7 )
							if( rsi1 <= 56.6668 )
								if( d_k <= -5.3014 )
									ret := 0.369264
								if( d_k > -5.3014 )
									ret := 0.041667
							if( rsi1 > 56.6668 )
								if( d_k <= 0.88649 )
									ret := 0.645397
								if( d_k > 0.88649 )
									ret := 0.410604
					if( ad > 757432 )
						if( rsi1 <= 68.5443 )
							if( smoothD_d <= 85.4046 )
								if( rsi1 <= 50.1951 )
									ret := 0.684211
								if( rsi1 > 50.1951 )
									ret := -0.156250
							if( smoothD_d > 85.4046 )
								if( d <= 94.427 )
									ret := -0.638298
								if( d > 94.427 )
									ret := 0.160000
						if( rsi1 > 68.5443 )
							if( ad <= 1.06489e+06 )
								if( rsi1 <= 78.7709 )
									ret := 0.685185
								if( rsi1 > 78.7709 )
									ret := 0.375000
							if( ad > 1.06489e+06 )
								if( rsi1 <= 82.6255 )
									ret := 0.047619
								if( rsi1 > 82.6255 )
									ret := -0.500000
		if( d_k > 2.67083 )
			if( smoothK_k <= 78.5372 )
				if( d_k <= 6.90796 )
					if( rsi1 <= 61.8436 )
						if( rsi1 <= 41.7569 )
							if( smoothK_k <= 74.5416 )
								if( ad_mf <= 40771.8 )
									ret := -0.512500
								if( ad_mf > 40771.8 )
									ret := -0.782609 // sell
							if( smoothK_k > 74.5416 )
								if( mf <= -0.004157 )
									ret := 0.103448
								if( mf > -0.004157 )
									ret := -0.800000 // sell
						if( rsi1 > 41.7569 )
							if( ad <= 69810.9 )
								if( ad <= -163147 )
									ret := -0.327044
								if( ad > -163147 )
									ret := -0.056830
							if( ad > 69810.9 )
								if( ad_mf <= 316043 )
									ret := -0.550802
								if( ad_mf > 316043 )
									ret := -0.153846
					if( rsi1 > 61.8436 )
						if( k <= 79.8695 )
							if( ad_mf <= -23591.6 )
								if( rsi1 <= 64.1801 )
									ret := 0.304348
								if( rsi1 > 64.1801 )
									ret := 0.601695
							if( ad_mf > -23591.6 )
								if( ad_mf <= 426338 )
									ret := 0.294118
								if( ad_mf > 426338 )
									ret := -0.214286
						if( k > 79.8695 )
							if( mf <= 0.189376 )
								if( d <= 86.8852 )
									ret := 0.164948
								if( d > 86.8852 )
									ret := 0.684211
							if( mf > 0.189376 )
								if( k <= 80.4721 )
									ret := -0.478261
								if( k > 80.4721 )
									ret := 0.090909
				if( d_k > 6.90796 )
					if( ad_mf <= 79901.6 )
						if( d <= 87.2204 )
							if( rsi1 <= 61.1893 )
								if( ad <= -420078 )
									ret := -0.840000 // sell
								if( ad > -420078 )
									ret := -0.240020
							if( rsi1 > 61.1893 )
								if( rsi1 <= 71.4703 )
									ret := 0.118674
								if( rsi1 > 71.4703 )
									ret := 0.623377
						if( d > 87.2204 )
							if( mf <= 0.04366 )
								if( rsi1 <= 41.2073 )
									ret := -0.400000
								if( rsi1 > 41.2073 )
									ret := -0.009091
							if( mf > 0.04366 )
								if( rsi1 <= 49.6909 )
									ret := -0.288889
								if( rsi1 > 49.6909 )
									ret := 0.252336
					if( ad_mf > 79901.6 )
						if( smoothD_d <= 81.356 )
							if( rsi1 <= 64.261 )
								if( ad_mf <= 227921 )
									ret := -0.532787
								if( ad_mf > 227921 )
									ret := -0.832168 // sell
							if( rsi1 > 64.261 )
								if( ad <= 307337 )
									ret := 0.039370
								if( ad > 307337 )
									ret := -0.606557
						if( smoothD_d > 81.356 )
							if( ad <= 882701 )
								if( rsi1 <= 51.2366 )
									ret := -0.675676
								if( rsi1 > 51.2366 )
									ret := -0.093496
							if( ad > 882701 )
								ret := 0.529412
			if( smoothK_k > 78.5372 )
				if( k <= 89.9712 )
					if( rsi1 <= 60.7577 )
						if( rsi1 <= 40.8347 )
							if( ad <= -137851 )
								ret := 0.076923
							if( ad > -137851 )
								if( mf <= -0.116125 )
									ret := -0.200000
								if( mf > -0.116125 )
									ret := -0.661972
						if( rsi1 > 40.8347 )
							if( ad <= 235124 )
								if( ad_mf <= -53826.2 )
									ret := -0.066667
								if( ad_mf > -53826.2 )
									ret := 0.077027
							if( ad > 235124 )
								if( ad <= 302605 )
									ret := -1.000000 // sell
								if( ad > 302605 )
									ret := -0.230769
					if( rsi1 > 60.7577 )
						if( ad <= 177270 )
							if( smoothD_d <= 90.5094 )
								if( mf <= 0.213856 )
									ret := 0.445876
								if( mf > 0.213856 )
									ret := 0.188406
							if( smoothD_d > 90.5094 )
								if( mf <= 0.143834 )
									ret := 0.296089
								if( mf > 0.143834 )
									ret := -0.046154
						if( ad > 177270 )
							if( rsi1 <= 68.8467 )
								if( mf <= 0.150257 )
									ret := 0.000000
								if( mf > 0.150257 )
									ret := -0.561404
							if( rsi1 > 68.8467 )
								if( ad <= 310439 )
									ret := -0.194444
								if( ad > 310439 )
									ret := 0.289157
				if( k > 89.9712 )
					if( ad <= 528014 )
						if( mf <= -0.173917 )
							if( d_k <= 3.01083 )
								ret := -0.666667
							if( d_k > 3.01083 )
								if( d <= 95.5927 )
									ret := 0.666667
								if( d > 95.5927 )
									ret := 0.045455
						if( mf > -0.173917 )
							if( rsi1 <= 65.7081 )
								if( rsi1 <= 55.8386 )
									ret := -0.025641
								if( rsi1 > 55.8386 )
									ret := 0.244635
							if( rsi1 > 65.7081 )
								if( d <= 93.4645 )
									ret := 0.950000 // buy
								if( d > 93.4645 )
									ret := 0.442191
					if( ad > 528014 )
						ret := -0.388889
	
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

//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")
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
float op_operation = decision_tree_0_DOTUSDT_30Min_a53d2cd8(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


