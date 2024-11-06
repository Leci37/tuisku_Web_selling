//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: UNIUSDT_15Min_2MS0_94b8b4d3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UNIUSDT_15Min_2MS0_94b8b4d3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UNIUSDT_15Min_94b8b4d3(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, rsi1, d, k, smoothD_d, d_k, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( smoothK_k <= 48.7891 )
		if( k <= 19.985 )
			if( rsi1 <= 44.0941 )
				if( Typical_Price <= 7.15717 )
					if( MFI_Low <= 26.1105 )
						if( rsi1 <= 26.6682 )
							if( Negative_Money_Flow_Sum <= 1.81831e+06 )
								if( MFI <= 28.8274 )
									ret := -0.352727
								if( MFI > 28.8274 )
									ret := -0.578767
							if( Negative_Money_Flow_Sum > 1.81831e+06 )
								if( Money_Flow_Ratio <= 0.39712 )
									ret := 0.025025
								if( Money_Flow_Ratio > 0.39712 )
									ret := -0.497436
						if( rsi1 > 26.6682 )
							if( rsi1 <= 37.3225 )
								if( MFI <= 37.5041 )
									ret := -0.134787
								if( MFI > 37.5041 )
									ret := -0.271569
							if( rsi1 > 37.3225 )
								if( d_k <= -3.65989 )
									ret := -0.208333
								if( d_k > -3.65989 )
									ret := -0.002479
					if( MFI_Low > 26.1105 )
						if( Positive_Money_Flow <= 29742.2 )
							if( rsi1 <= 37.1345 )
								if( smoothK_k <= -2.99197 )
									ret := -0.282828
								if( smoothK_k > -2.99197 )
									ret := -0.507703
							if( rsi1 > 37.1345 )
								if( Typical_Price <= 5.56917 )
									ret := -0.121908
								if( Typical_Price > 5.56917 )
									ret := -0.293078
						if( Positive_Money_Flow > 29742.2 )
							if( rsi1 <= 37.496 )
								if( smoothK_k <= -2.25734 )
									ret := -0.450382
								if( smoothK_k > -2.25734 )
									ret := -0.693805
							if( rsi1 > 37.496 )
								if( Typical_Price <= 6.26724 )
									ret := -0.331081
								if( Typical_Price > 6.26724 )
									ret := -0.609649
				if( Typical_Price > 7.15717 )
					if( Positive_Money_Flow_Sum <= 1.21406e+06 )
						if( rsi1 <= 24.975 )
							if( MFI_Low <= -7.01245 )
								if( Typical_Price <= 7.62853 )
									ret := -0.622642
								if( Typical_Price > 7.62853 )
									ret := -0.112676
							if( MFI_Low > -7.01245 )
								if( Negative_Money_Flow <= 865382 )
									ret := -0.711667 // sell
								if( Negative_Money_Flow > 865382 )
									ret := 0.000000
						if( rsi1 > 24.975 )
							if( MFI <= 13.5763 )
								if( Negative_Money_Flow_Sum <= 2.15041e+06 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 2.15041e+06 )
									ret := 0.769231 // buy
							if( MFI > 13.5763 )
								if( MFI <= 38.2164 )
									ret := -0.278068
								if( MFI > 38.2164 )
									ret := -0.484337
					if( Positive_Money_Flow_Sum > 1.21406e+06 )
						if( rsi1 <= 34.1319 )
							if( MFI <= 20.3187 )
								if( d_k <= 5.51899 )
									ret := -0.614035
								if( d_k > 5.51899 )
									ret := 0.461538
							if( MFI > 20.3187 )
								if( Typical_Price <= 7.31133 )
									ret := -0.411765
								if( Typical_Price > 7.31133 )
									ret := -0.748227 // sell
						if( rsi1 > 34.1319 )
							if( MFI <= 55.1557 )
								if( Negative_Money_Flow <= 414440 )
									ret := -0.489796
								if( Negative_Money_Flow > 414440 )
									ret := -0.244186
							if( MFI > 55.1557 )
								if( Positive_Money_Flow_Sum <= 2.34911e+06 )
									ret := -0.560241
								if( Positive_Money_Flow_Sum > 2.34911e+06 )
									ret := -0.727273 // sell
			if( rsi1 > 44.0941 )
				if( Positive_Money_Flow <= 98008.5 )
					if( rsi1 <= 59.4464 )
						if( Money_Flow_Ratio <= 2.18096 )
							if( rsi1 <= 51.5133 )
								if( Money_Flow_Ratio <= 0.518466 )
									ret := 0.292398
								if( Money_Flow_Ratio > 0.518466 )
									ret := -0.110221
							if( rsi1 > 51.5133 )
								if( Positive_Money_Flow_Sum <= 9.39106e+06 )
									ret := 0.089337
								if( Positive_Money_Flow_Sum > 9.39106e+06 )
									ret := 0.809524 // buy
						if( Money_Flow_Ratio > 2.18096 )
							if( Raw_Money_Flow <= 39174 )
								if( Positive_Money_Flow_Sum <= 743104 )
									ret := 0.010204
								if( Positive_Money_Flow_Sum > 743104 )
									ret := -0.204082
							if( Raw_Money_Flow > 39174 )
								if( rsi1 <= 48.0099 )
									ret := -0.584071
								if( rsi1 > 48.0099 )
									ret := -0.240429
					if( rsi1 > 59.4464 )
						if( MFI_High <= -6.70714 )
							if( Negative_Money_Flow_Sum <= 544089 )
								if( Raw_Money_Flow <= 93289.1 )
									ret := -0.021739
								if( Raw_Money_Flow > 93289.1 )
									ret := 0.333333
							if( Negative_Money_Flow_Sum > 544089 )
								if( smoothK_k <= 5.72555 )
									ret := 0.281250
								if( smoothK_k > 5.72555 )
									ret := 0.635802
						if( MFI_High > -6.70714 )
							if( rsi1 <= 67.9332 )
								if( Negative_Money_Flow_Sum <= 1.27465e+06 )
									ret := 0.032558
								if( Negative_Money_Flow_Sum > 1.27465e+06 )
									ret := -0.323529
							if( rsi1 > 67.9332 )
								if( d_k <= 8.58589 )
									ret := 0.543860
								if( d_k > 8.58589 )
									ret := 0.130435
				if( Positive_Money_Flow > 98008.5 )
					if( Money_Flow_Ratio <= 1.56985 )
						if( Typical_Price <= 6.18022 )
							if( rsi1 <= 50.1073 )
								if( Positive_Money_Flow_Sum <= 393455 )
									ret := -0.750000 // sell
								if( Positive_Money_Flow_Sum > 393455 )
									ret := 0.344828
							if( rsi1 > 50.1073 )
								if( MFI <= 42.8562 )
									ret := 0.875000 // buy
								if( MFI > 42.8562 )
									ret := -0.136986
						if( Typical_Price > 6.18022 )
							if( MFI_High <= -19.9609 )
								if( Negative_Money_Flow_Sum <= 6.72413e+06 )
									ret := -0.292191
								if( Negative_Money_Flow_Sum > 6.72413e+06 )
									ret := 0.180000
							if( MFI_High > -19.9609 )
								if( d <= 4.22215 )
									ret := -0.666667
								if( d > 4.22215 )
									ret := 0.466667
					if( Money_Flow_Ratio > 1.56985 )
						if( rsi1 <= 67.4172 )
							if( Money_Flow_Ratio <= 4.72019 )
								if( rsi1 <= 56.6352 )
									ret := -0.496285
								if( rsi1 > 56.6352 )
									ret := -0.158621
							if( Money_Flow_Ratio > 4.72019 )
								if( smoothD_d <= 30.5711 )
									ret := -0.768362 // sell
								if( smoothD_d > 30.5711 )
									ret := -0.458333
						if( rsi1 > 67.4172 )
							if( Positive_Money_Flow_Sum <= 2.68502e+07 )
								if( Negative_Money_Flow_Sum <= 1.31613e+06 )
									ret := 0.250000
								if( Negative_Money_Flow_Sum > 1.31613e+06 )
									ret := -0.600000
							if( Positive_Money_Flow_Sum > 2.68502e+07 )
								if( Positive_Money_Flow_Sum <= 4.20424e+07 )
									ret := 0.944444 // buy
								if( Positive_Money_Flow_Sum > 4.20424e+07 )
									ret := 0.000000
		if( k > 19.985 )
			if( MFI_Low <= 25.768 )
				if( rsi1 <= 42.032 )
					if( Money_Flow_Ratio <= 0.597882 )
						if( MFI <= 17.948 )
							if( Positive_Money_Flow_Sum <= 254539 )
								if( d <= 21.1163 )
									ret := -0.305882
								if( d > 21.1163 )
									ret := 0.039014
							if( Positive_Money_Flow_Sum > 254539 )
								if( smoothD_d <= 16.0666 )
									ret := -0.150327
								if( smoothD_d > 16.0666 )
									ret := 0.276812
						if( MFI > 17.948 )
							if( rsi1 <= 31.1196 )
								if( Raw_Money_Flow <= 204884 )
									ret := -0.381244
								if( Raw_Money_Flow > 204884 )
									ret := -0.175347
							if( rsi1 > 31.1196 )
								if( Negative_Money_Flow <= 96802.5 )
									ret := -0.080638
								if( Negative_Money_Flow > 96802.5 )
									ret := 0.145396
					if( Money_Flow_Ratio > 0.597882 )
						if( Typical_Price <= 7.30806 )
							if( Negative_Money_Flow <= 280122 )
								if( d_k <= 12.9252 )
									ret := -0.276576
								if( d_k > 12.9252 )
									ret := -0.016667
							if( Negative_Money_Flow > 280122 )
								if( k <= 30.6746 )
									ret := -0.156863
								if( k > 30.6746 )
									ret := 0.467742
						if( Typical_Price > 7.30806 )
							if( MFI_Low <= 24.0423 )
								if( Negative_Money_Flow_Sum <= 1.92758e+06 )
									ret := -0.383234
								if( Negative_Money_Flow_Sum > 1.92758e+06 )
									ret := -0.721053 // sell
							if( MFI_Low > 24.0423 )
								if( Negative_Money_Flow <= 767431 )
									ret := 0.080000
								if( Negative_Money_Flow > 767431 )
									ret := -0.714286 // sell
				if( rsi1 > 42.032 )
					if( Negative_Money_Flow <= 174159 )
						if( smoothD_d <= 31.5774 )
							if( Positive_Money_Flow_Sum <= 4.96572e+06 )
								if( MFI_Low <= 15.3531 )
									ret := 0.113514
								if( MFI_Low > 15.3531 )
									ret := -0.025518
							if( Positive_Money_Flow_Sum > 4.96572e+06 )
								if( Positive_Money_Flow_Sum <= 6.22043e+06 )
									ret := 0.869565 // buy
								if( Positive_Money_Flow_Sum > 6.22043e+06 )
									ret := -0.222222
						if( smoothD_d > 31.5774 )
							if( MFI_Low <= 12.1344 )
								if( Raw_Money_Flow <= 54784.2 )
									ret := 0.235714
								if( Raw_Money_Flow > 54784.2 )
									ret := 0.534783
							if( MFI_Low > 12.1344 )
								if( rsi1 <= 53.6917 )
									ret := 0.097235
								if( rsi1 > 53.6917 )
									ret := 0.411017
					if( Negative_Money_Flow > 174159 )
						if( d_k <= 8.45638 )
							if( smoothD_d <= 14.6184 )
								if( k <= 25.7668 )
									ret := -0.176471
								if( k > 25.7668 )
									ret := 0.421053
							if( smoothD_d > 14.6184 )
								if( d_k <= -22.6718 )
									ret := -0.300000
								if( d_k > -22.6718 )
									ret := 0.582003
						if( d_k > 8.45638 )
							if( Positive_Money_Flow_Sum <= 4.96926e+06 )
								if( Negative_Money_Flow_Sum <= 3.54822e+06 )
									ret := 0.097015
								if( Negative_Money_Flow_Sum > 3.54822e+06 )
									ret := 0.666667
							if( Positive_Money_Flow_Sum > 4.96926e+06 )
								if( Negative_Money_Flow <= 663041 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow > 663041 )
									ret := 0.000000
			if( MFI_Low > 25.768 )
				if( Positive_Money_Flow <= 6043.86 )
					if( rsi1 <= 48.3316 )
						if( rsi1 <= 42.9467 )
							if( Positive_Money_Flow_Sum <= 628215 )
								if( MFI <= 51.3542 )
									ret := -0.027650
								if( MFI > 51.3542 )
									ret := -0.312268
							if( Positive_Money_Flow_Sum > 628215 )
								if( Raw_Money_Flow <= 271529 )
									ret := -0.451515
								if( Raw_Money_Flow > 271529 )
									ret := -0.164251
						if( rsi1 > 42.9467 )
							if( MFI_High <= -24.4051 )
								if( Positive_Money_Flow <= 27.4541 )
									ret := -0.022130
								if( Positive_Money_Flow > 27.4541 )
									ret := -0.900000 // sell
							if( MFI_High > -24.4051 )
								if( Typical_Price <= 6.59328 )
									ret := -0.078947
								if( Typical_Price > 6.59328 )
									ret := -0.485106
					if( rsi1 > 48.3316 )
						if( rsi1 <= 59.8741 )
							if( MFI <= 72.1307 )
								if( Money_Flow_Ratio <= 1.27008 )
									ret := 0.194417
								if( Money_Flow_Ratio > 1.27008 )
									ret := 0.044836
							if( MFI > 72.1307 )
								if( Typical_Price <= 5.4661 )
									ret := 0.142857
								if( Typical_Price > 5.4661 )
									ret := -0.421405
						if( rsi1 > 59.8741 )
							if( MFI_Low <= 57.4996 )
								if( d_k <= 2.60439 )
									ret := 0.500000
								if( d_k > 2.60439 )
									ret := 0.265469
							if( MFI_Low > 57.4996 )
								if( rsi1 <= 65.9333 )
									ret := -0.280702
								if( rsi1 > 65.9333 )
									ret := 0.236264
				if( Positive_Money_Flow > 6043.86 )
					if( d_k <= -5.08645 )
						if( smoothK_k <= 27.3053 )
							if( rsi1 <= 51.1299 )
								if( Typical_Price <= 6.88561 )
									ret := -0.302439
								if( Typical_Price > 6.88561 )
									ret := -0.641509
							if( rsi1 > 51.1299 )
								if( Negative_Money_Flow_Sum <= 4.08463e+06 )
									ret := -0.036290
								if( Negative_Money_Flow_Sum > 4.08463e+06 )
									ret := 0.866667 // buy
						if( smoothK_k > 27.3053 )
							if( rsi1 <= 58.0009 )
								if( MFI_High <= -22.0106 )
									ret := -0.150573
								if( MFI_High > -22.0106 )
									ret := -0.331395
							if( rsi1 > 58.0009 )
								if( Raw_Money_Flow <= 827400 )
									ret := 0.206501
								if( Raw_Money_Flow > 827400 )
									ret := -0.250000
					if( d_k > -5.08645 )
						if( Negative_Money_Flow_Sum <= 3.53794e+06 )
							if( Negative_Money_Flow_Sum <= 2.73308e+06 )
								if( rsi1 <= 51.9976 )
									ret := -0.453748
								if( rsi1 > 51.9976 )
									ret := -0.043310
							if( Negative_Money_Flow_Sum > 2.73308e+06 )
								if( Positive_Money_Flow <= 200077 )
									ret := -0.152174
								if( Positive_Money_Flow > 200077 )
									ret := -0.669173
						if( Negative_Money_Flow_Sum > 3.53794e+06 )
							if( rsi1 <= 51.0157 )
								if( rsi1 <= 42.5926 )
									ret := -0.688525
								if( rsi1 > 42.5926 )
									ret := -0.274725
							if( rsi1 > 51.0157 )
								if( Money_Flow_Ratio <= 2.98592 )
									ret := 0.500000
								if( Money_Flow_Ratio > 2.98592 )
									ret := -0.119048
	if( smoothK_k > 48.7891 )
		if( rsi1 <= 58.7108 )
			if( MFI_High <= -35.3379 )
				if( rsi1 <= 47.2779 )
					if( Raw_Money_Flow <= 258766 )
						if( rsi1 <= 39.0277 )
							if( MFI <= 18.8446 )
								if( Negative_Money_Flow_Sum <= 1.4913e+06 )
									ret := -0.043651
								if( Negative_Money_Flow_Sum > 1.4913e+06 )
									ret := 0.285347
							if( MFI > 18.8446 )
								if( Negative_Money_Flow_Sum <= 4.20193e+06 )
									ret := -0.095238
								if( Negative_Money_Flow_Sum > 4.20193e+06 )
									ret := -0.555556
						if( rsi1 > 39.0277 )
							if( MFI_High <= -49.7023 )
								if( Negative_Money_Flow <= 38866.3 )
									ret := 0.143455
								if( Negative_Money_Flow > 38866.3 )
									ret := 0.441308
							if( MFI_High > -49.7023 )
								if( Raw_Money_Flow <= 146973 )
									ret := 0.001271
								if( Raw_Money_Flow > 146973 )
									ret := 0.154545
					if( Raw_Money_Flow > 258766 )
						if( MFI_High <= -45.5522 )
							if( Positive_Money_Flow <= 283159 )
								if( rsi1 <= 35.8249 )
									ret := 0.280000
								if( rsi1 > 35.8249 )
									ret := 0.658904
							if( Positive_Money_Flow > 283159 )
								if( rsi1 <= 37.7366 )
									ret := -0.119318
								if( rsi1 > 37.7366 )
									ret := 0.362205
						if( MFI_High > -45.5522 )
							if( Typical_Price <= 6.05722 )
								if( Positive_Money_Flow_Sum <= 2.3955e+06 )
									ret := 0.538462
								if( Positive_Money_Flow_Sum > 2.3955e+06 )
									ret := -0.375000
							if( Typical_Price > 6.05722 )
								if( rsi1 <= 42.9324 )
									ret := -0.368687
								if( rsi1 > 42.9324 )
									ret := 0.074286
				if( rsi1 > 47.2779 )
					if( Negative_Money_Flow <= 47502.5 )
						if( Negative_Money_Flow_Sum <= 1.18054e+06 )
							if( Negative_Money_Flow_Sum <= 325491 )
								if( Positive_Money_Flow_Sum <= 34976.1 )
									ret := 0.500000
								if( Positive_Money_Flow_Sum > 34976.1 )
									ret := 0.060386
							if( Negative_Money_Flow_Sum > 325491 )
								if( Typical_Price <= 7.64874 )
									ret := 0.259155
								if( Typical_Price > 7.64874 )
									ret := 0.000000
						if( Negative_Money_Flow_Sum > 1.18054e+06 )
							if( MFI_High <= -40.3065 )
								if( d_k <= -18.4781 )
									ret := 0.097902
								if( d_k > -18.4781 )
									ret := 0.494172
							if( MFI_High > -40.3065 )
								if( Positive_Money_Flow_Sum <= 874192 )
									ret := 0.937500 // buy
								if( Positive_Money_Flow_Sum > 874192 )
									ret := 0.185185
					if( Negative_Money_Flow > 47502.5 )
						if( MFI_High <= -47.4541 )
							if( Negative_Money_Flow <= 314315 )
								if( d_k <= -18.5627 )
									ret := 0.300000
								if( d_k > -18.5627 )
									ret := 0.658708
							if( Negative_Money_Flow > 314315 )
								if( Positive_Money_Flow_Sum <= 4.99454e+06 )
									ret := 0.878378 // buy
								if( Positive_Money_Flow_Sum > 4.99454e+06 )
									ret := 0.153846
						if( MFI_High > -47.4541 )
							if( rsi1 <= 51.6394 )
								if( MFI_Low <= 22.9774 )
									ret := 0.242630
								if( MFI_Low > 22.9774 )
									ret := 0.594340
							if( rsi1 > 51.6394 )
								if( Typical_Price <= 15.4422 )
									ret := 0.517154
								if( Typical_Price > 15.4422 )
									ret := -1.000000 // sell
			if( MFI_High > -35.3379 )
				if( Negative_Money_Flow <= 29586 )
					if( rsi1 <= 53.1103 )
						if( Typical_Price <= 7.20752 )
							if( k <= 65.3549 )
								if( rsi1 <= 49.6052 )
									ret := -0.294014
								if( rsi1 > 49.6052 )
									ret := -0.119318
							if( k > 65.3549 )
								if( Typical_Price <= 3.84893 )
									ret := 0.650000
								if( Typical_Price > 3.84893 )
									ret := -0.061947
						if( Typical_Price > 7.20752 )
							if( smoothK_k <= 69.372 )
								if( Positive_Money_Flow_Sum <= 928000 )
									ret := -0.330435
								if( Positive_Money_Flow_Sum > 928000 )
									ret := -0.613419
							if( smoothK_k > 69.372 )
								if( d_k <= -16.3066 )
									ret := 0.379310
								if( d_k > -16.3066 )
									ret := -0.211382
					if( rsi1 > 53.1103 )
						if( MFI_High <= -24.3298 )
							if( Raw_Money_Flow <= 2.06248e+06 )
								if( Negative_Money_Flow_Sum <= 5.22655e+06 )
									ret := 0.171536
								if( Negative_Money_Flow_Sum > 5.22655e+06 )
									ret := -0.620690
							if( Raw_Money_Flow > 2.06248e+06 )
								if( rsi1 <= 58.089 )
									ret := 1.000000 // buy
								if( rsi1 > 58.089 )
									ret := 0.750000 // buy
						if( MFI_High > -24.3298 )
							if( Raw_Money_Flow <= 89552.1 )
								if( Money_Flow_Ratio <= 3.30868 )
									ret := 0.070773
								if( Money_Flow_Ratio > 3.30868 )
									ret := -0.233333
							if( Raw_Money_Flow > 89552.1 )
								if( smoothD_d <= 76.5536 )
									ret := -0.313167
								if( smoothD_d > 76.5536 )
									ret := 0.010909
				if( Negative_Money_Flow > 29586 )
					if( rsi1 <= 51.6733 )
						if( Negative_Money_Flow_Sum <= 4.34402e+06 )
							if( Negative_Money_Flow_Sum <= 3.50861e+06 )
								if( rsi1 <= 40.5068 )
									ret := -0.300493
								if( rsi1 > 40.5068 )
									ret := 0.023227
							if( Negative_Money_Flow_Sum > 3.50861e+06 )
								if( Negative_Money_Flow_Sum <= 4.12676e+06 )
									ret := 0.757576 // buy
								if( Negative_Money_Flow_Sum > 4.12676e+06 )
									ret := -0.125000
						if( Negative_Money_Flow_Sum > 4.34402e+06 )
							if( rsi1 <= 37.0597 )
								if( Negative_Money_Flow <= 888456 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow > 888456 )
									ret := 0.000000
							if( rsi1 > 37.0597 )
								if( d_k <= -12.345 )
									ret := 0.375000
								if( d_k > -12.345 )
									ret := -0.683544
					if( rsi1 > 51.6733 )
						if( MFI <= 57.5015 )
							if( d_k <= -10.9014 )
								if( rsi1 <= 55.0267 )
									ret := -0.104651
								if( rsi1 > 55.0267 )
									ret := 0.342105
							if( d_k > -10.9014 )
								if( d_k <= 18.0347 )
									ret := 0.343073
								if( d_k > 18.0347 )
									ret := -0.235294
						if( MFI > 57.5015 )
							if( Typical_Price <= 5.27007 )
								if( Negative_Money_Flow <= 107657 )
									ret := 0.194175
								if( Negative_Money_Flow > 107657 )
									ret := 0.672727
							if( Typical_Price > 5.27007 )
								if( d <= 51.342 )
									ret := -0.479167
								if( d > 51.342 )
									ret := 0.022599
		if( rsi1 > 58.7108 )
			if( MFI <= 60.9412 )
				if( rsi1 <= 65.8386 )
					if( MFI_High <= -30.4665 )
						if( Negative_Money_Flow_Sum <= 280881 )
							if( Positive_Money_Flow_Sum <= 233933 )
								if( MFI_Low <= 28.0507 )
									ret := 0.147465
								if( MFI_Low > 28.0507 )
									ret := -0.190476
							if( Positive_Money_Flow_Sum > 233933 )
								if( k <= 72.3298 )
									ret := 1.000000 // buy
								if( k > 72.3298 )
									ret := 0.230769
						if( Negative_Money_Flow_Sum > 280881 )
							if( Raw_Money_Flow <= 27535.5 )
								if( Negative_Money_Flow_Sum <= 577755 )
									ret := 0.195122
								if( Negative_Money_Flow_Sum > 577755 )
									ret := 0.442308
							if( Raw_Money_Flow > 27535.5 )
								if( smoothK_k <= 96.9756 )
									ret := 0.600662
								if( smoothK_k > 96.9756 )
									ret := 0.292929
					if( MFI_High > -30.4665 )
						if( Negative_Money_Flow_Sum <= 3.00344e+06 )
							if( Positive_Money_Flow <= 1.00526e+06 )
								if( Negative_Money_Flow <= 29287.5 )
									ret := 0.208741
								if( Negative_Money_Flow > 29287.5 )
									ret := 0.381696
							if( Positive_Money_Flow > 1.00526e+06 )
								if( Negative_Money_Flow_Sum <= 2.00211e+06 )
									ret := -0.500000
								if( Negative_Money_Flow_Sum > 2.00211e+06 )
									ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 3.00344e+06 )
							if( MFI_High <= -19.4001 )
								if( smoothD_d <= 32.0634 )
									ret := -0.285714
								if( smoothD_d > 32.0634 )
									ret := 0.680751
							if( MFI_High > -19.4001 )
								if( Negative_Money_Flow_Sum <= 3.6904e+06 )
									ret := -0.500000
								if( Negative_Money_Flow_Sum > 3.6904e+06 )
									ret := 0.000000
				if( rsi1 > 65.8386 )
					if( Raw_Money_Flow <= 27749.7 )
						if( Raw_Money_Flow <= 14374.7 )
							if( Positive_Money_Flow_Sum <= 204031 )
								if( Negative_Money_Flow <= 174.412 )
									ret := 0.111111
								if( Negative_Money_Flow > 174.412 )
									ret := 0.383721
							if( Positive_Money_Flow_Sum > 204031 )
								if( Negative_Money_Flow_Sum <= 167503 )
									ret := 0.956522 // buy
								if( Negative_Money_Flow_Sum > 167503 )
									ret := 0.356322
						if( Raw_Money_Flow > 14374.7 )
							if( Negative_Money_Flow_Sum <= 275401 )
								if( d_k <= -18.5948 )
									ret := 0.000000
								if( d_k > -18.5948 )
									ret := 0.396648
							if( Negative_Money_Flow_Sum > 275401 )
								if( d_k <= -1.80386 )
									ret := 0.641304
								if( d_k > -1.80386 )
									ret := 0.421429
					if( Raw_Money_Flow > 27749.7 )
						if( Negative_Money_Flow_Sum <= 270288 )
							if( d_k <= 0.203417 )
								if( Positive_Money_Flow <= 34465.9 )
									ret := 0.456522
								if( Positive_Money_Flow > 34465.9 )
									ret := 0.118644
							if( d_k > 0.203417 )
								if( rsi1 <= 73.2374 )
									ret := 0.314286
								if( rsi1 > 73.2374 )
									ret := 0.868421 // buy
						if( Negative_Money_Flow_Sum > 270288 )
							if( rsi1 <= 76.6361 )
								if( Negative_Money_Flow <= 82591.2 )
									ret := 0.627112
								if( Negative_Money_Flow > 82591.2 )
									ret := 0.743386 // buy
							if( rsi1 > 76.6361 )
								if( Negative_Money_Flow_Sum <= 1.31538e+06 )
									ret := 0.824121 // buy
								if( Negative_Money_Flow_Sum > 1.31538e+06 )
									ret := 0.694981
			if( MFI > 60.9412 )
				if( rsi1 <= 70.9681 )
					if( MFI <= 84.7379 )
						if( MFI <= 75.4899 )
							if( rsi1 <= 64.5173 )
								if( Raw_Money_Flow <= 987363 )
									ret := 0.140851
								if( Raw_Money_Flow > 987363 )
									ret := -0.287879
							if( rsi1 > 64.5173 )
								if( Typical_Price <= 9.62978 )
									ret := 0.267081
								if( Typical_Price > 9.62978 )
									ret := 0.605263
						if( MFI > 75.4899 )
							if( smoothD_d <= 71.4411 )
								if( d_k <= -9.42798 )
									ret := 0.189781
								if( d_k > -9.42798 )
									ret := -0.161943
							if( smoothD_d > 71.4411 )
								if( d_k <= 11.148 )
									ret := 0.118408
								if( d_k > 11.148 )
									ret := 0.487179
					if( MFI > 84.7379 )
						if( Negative_Money_Flow_Sum <= 111562 )
							if( Positive_Money_Flow_Sum <= 866350 )
								if( Positive_Money_Flow <= 229603 )
									ret := 0.000000
								if( Positive_Money_Flow > 229603 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 866350 )
								if( Positive_Money_Flow <= 27008.2 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow > 27008.2 )
									ret := 0.285714
						if( Negative_Money_Flow_Sum > 111562 )
							if( Positive_Money_Flow <= 23007.7 )
								if( d_k <= 3.09019 )
									ret := 0.181818
								if( d_k > 3.09019 )
									ret := -0.303571
							if( Positive_Money_Flow > 23007.7 )
								if( smoothD_d <= 73.6337 )
									ret := -0.650407
								if( smoothD_d > 73.6337 )
									ret := -0.303922
				if( rsi1 > 70.9681 )
					if( MFI <= 68.0747 )
						if( Raw_Money_Flow <= 18559.1 )
							if( k <= 87.2356 )
								if( Typical_Price <= 6.32769 )
									ret := 0.761905 // buy
								if( Typical_Price > 6.32769 )
									ret := -0.750000 // sell
							if( k > 87.2356 )
								if( Money_Flow_Ratio <= 1.95191 )
									ret := 0.111111
								if( Money_Flow_Ratio > 1.95191 )
									ret := -0.200000
						if( Raw_Money_Flow > 18559.1 )
							if( rsi1 <= 76.9307 )
								if( k <= 99.4954 )
									ret := 0.593407
								if( k > 99.4954 )
									ret := 0.150943
							if( rsi1 > 76.9307 )
								if( Negative_Money_Flow_Sum <= 732469 )
									ret := 0.803279 // buy
								if( Negative_Money_Flow_Sum > 732469 )
									ret := 0.547771
					if( MFI > 68.0747 )
						if( rsi1 <= 80.0024 )
							if( MFI_High <= 2.12588 )
								if( smoothD_d <= 96.0254 )
									ret := 0.356379
								if( smoothD_d > 96.0254 )
									ret := -0.061728
							if( MFI_High > 2.12588 )
								if( Positive_Money_Flow_Sum <= 1.16329e+06 )
									ret := 0.367688
								if( Positive_Money_Flow_Sum > 1.16329e+06 )
									ret := 0.089808
						if( rsi1 > 80.0024 )
							if( MFI_Low <= 60.3911 )
								if( Typical_Price <= 6.93785 )
									ret := 0.556962
								if( Typical_Price > 6.93785 )
									ret := 0.782178 // buy
							if( MFI_Low > 60.3911 )
								if( Raw_Money_Flow <= 1.40899e+06 )
									ret := 0.355281
								if( Raw_Money_Flow > 1.40899e+06 )
									ret := 0.776471 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Money_Flow_Index 
//@version=5
//indicator title="Money Flow Index (MFI)", shorttitle="MFI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)

// Input parameters
length_MFI = input.int(14, minval=1, title="MFI Length")

// Calculate the Typical Price
Typical_Price = (high + low + close) / 3

// Calculate Raw Money Flow
Raw_Money_Flow = Typical_Price * volume

// Calculate Positive and Negative Money Flow
Positive_Money_Flow = Raw_Money_Flow * (Typical_Price > Typical_Price[1] ? 1 : 0)
Negative_Money_Flow = Raw_Money_Flow * (Typical_Price < Typical_Price[1] ? 1 : 0)

// Sum of Positive and Negative Money Flow over the given length
Positive_Money_Flow_Sum = ta.sma(Positive_Money_Flow, length_MFI) * length_MFI
Negative_Money_Flow_Sum = ta.sma(Negative_Money_Flow, length_MFI) * length_MFI

// Calculate Money Flow Ratio
Money_Flow_Ratio = Positive_Money_Flow_Sum / Negative_Money_Flow_Sum

// Calculate MFI
MFI = 100 - (100 / (1 + Money_Flow_Ratio))

// Calculate MFI high and low bands
MFI_High = MFI - 80
MFI_Low = MFI - 20

// Plot the MFI
plot(MFI, color=color.blue, title="MFI")

// Plot the MFI high and low bands
hline(80, "MFI High", color=color.red, linestyle=hline.style_dashed)
hline(20, "MFI Low", color=color.green, linestyle=hline.style_dashed)
plot(MFI_High, color=color.red, title="MFI High Band")
plot(MFI_Low, color=color.green, title="MFI Low Band")


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
float op_operation = decision_tree_0_UNIUSDT_15Min_94b8b4d3(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, rsi1, d, k, smoothD_d, d_k, smoothK_k)

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


